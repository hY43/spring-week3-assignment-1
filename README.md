# 테스트 작성하기

## 과제 목표

- 우리가 작성한 코드가 올바르게 동작하는지 자동으로 확인해 줄 수 있는 유닛 테스트를 작성
- controller 는 Spring Mock MVC 테스트 추가로 작성

## 작업목록

- [x] Task 모델 테스트
- [x] ErrorResponse 테스트
- [x] TaskService 테스트
- [x] TaskController 유닛 테스트
- [x] TaskController MockMVC 테스트

## 추가작업목록
- [x] 모든 테스트 케이스에서 given() 제외하고 테스트코드 작성
- [x] given 조사하기
  - [x] 이해안되는 부분 질문
  - [ ] 새롭게 알게된 내용 정리하기

## 요구 사항

- [ ] 모든 인수 테스트를 통과해야 합니다.
- [ ] 테스트 커버리지 100%를 달성해야 합니다.

![image](https://user-images.githubusercontent.com/14071105/104756530-45f47f80-579f-11eb-9bbf-d47d065e207b.png)

## API 실행하기

```bash
./gradlew run
```

## Web 실행하기

```bash
cd web
npm install
npm run dev
```

## 테스트

### Spring 테스트 실행

```bash
$ ./gradlew test
```

### 커버리지 확인하기

테스트를 실행하면 자동으로 커버리지 정보를 수집하여 저장합니다. 커버리지 정보는 `app/build/reports`
폴더에 저장됩니다. 커버리지 정보를 확인하려면 `app/build/reports/jacoco/test/html/index.html`파일을
브라우저에서 열면 확인할 수 있습니다.

### 설치하기

```bash
$ cd tests
$ npm install
```

### E2E 테스트 실행하기

테스트는 실제로 동작하는 서버에 테스트하므로 서버가 동작하고 있는 상태여야 올바르게 동작합니다.  
프론트엔드 개발용 서버도 동작하고 있는 상태여야 올바르게 동작합니다.

```bash
$ npm run e2e
```


