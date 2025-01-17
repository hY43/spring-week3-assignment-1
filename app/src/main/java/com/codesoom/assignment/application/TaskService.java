package com.codesoom.assignment.application;

import com.codesoom.assignment.domain.Task;
import com.codesoom.assignment.exception.TaskHasInvalidTitleException;
import com.codesoom.assignment.exception.TaskNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks;
    private Long maxId = 0L;

    public TaskService() {
        this.tasks = new ArrayList<>();
    }

    public List<Task> list() {
        return tasks;
    }

    public Task detail(Long id) {
        return findTaskById(id);
    }

    public Task create(Task task) {
        if (!task.hasValidTitle()) {
            throw new TaskHasInvalidTitleException();
        }

        Task createdTask = Task.createNewTask(generateId(), task);
        tasks.add(createdTask);
        return createdTask;
    }

    public Task update(Long id, Task task) {

        if (!task.hasValidTitle()) {
            throw new TaskHasInvalidTitleException();
        }

        Task foundTask = findTaskById(id);
        foundTask.changeTitle(task);

        return foundTask;
    }

    private Long generateId() {
        maxId += 1;
        return maxId;
    }

    private Task findTaskById(Long id) {
        return tasks.stream()
                .filter((task) -> task.isMyId(id))
                .findFirst()
                .orElseThrow(() -> new TaskNotFoundException());
    }

    public void delete(Long id) {
        Task foundTask = findTaskById(id);
        tasks.remove(foundTask);
    }
}
