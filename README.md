# SPRING ADVANCED

# 1.프로젝트 설명
이 프로젝트는 제공된 Spring Boot 애플리케이션의 오류를 해결하고, 코드 품질을 개선하는 능력을 기르기 위한 과제입니다.

# 2.개발 환경
* 개발 언어: Java
* JDK 버전: 17
* 프레임워크: Spring Boot 3.3.3
* 빌드 도구: Gradle
* 데이터베이스: MySQL
* ORM: Spring Data JPA (Hibernate)
* 보안 / 인증: JWT, BCrypt
* IDE: IntelliJ IDEA
* API 테스트 도구: Postman

# 3.단계별 구현 기능
| 레벨 | 기능명 | 간단 설명 |
|------|--------|-----------|
| Lv 0 | 프로젝트 세팅 & 에러 분석 | 애플리케이션 실행 오류를 분석하고 프로젝트가 정상 구동되도록 환경을 수정 |
| Lv 1 | ArgumentResolver 복구 | `AuthUserArgumentResolver`가 다시 동작하도록 복구 |
| Lv 2 | 코드 개선(리팩토링) | Early Return, 불필요한 if-else 제거, DTO Validation 적용 등 코드 리팩토링 |
| Lv 3 | N+1 문제 해결 | 기존 fetch join 로직을 `@EntityGraph` 기반으로 변경 |
| Lv 4 | 테스트 코드 수정 | 실패하는 테스트 코드 및 로직과 테스트가 일치하도록 코드 및 예외 수정 |
