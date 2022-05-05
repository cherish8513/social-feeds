# 문제해결 전략

1. 의존성 주입 : 확장에 열려있고 변경에 닫혀있는 설계 의존성 주입을 위한 객체를 만듬
2. 싱글톤 보장 : 객체를 ThreadLocal을 사용해 thread safe한 싱글톤 객체임을 보장
3. 모듈화 : 회원과 feed api를 분리해 독립적으로 실행
4. 책임분리 : Controller -> Service -> Repository의 위임
5. thread-safety : ThreadLocal로 동시성 문제 해결
6. 인증처리 : gateway 모듈에서 인증 작업을 거친 후 서비스 통신

해결 못한 문제 사항
1. Spring framework 없이 웹 통신은 어떻게?
2. 웹 통신시 Controller 객체 주입은 어떻게?