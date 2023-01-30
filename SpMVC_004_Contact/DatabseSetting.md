# SpringMVC DB 연동 Project
* SpringMVC 프로젝트에서 DB 연동하는 방법은 여러가지가 있다. 기초적인 SQL 을 통한 연동, 미들웨어를 통한 간접 SQL 을 통한 연동, JPA(Java persistance Arch)를 이용한 방법

## SpringMVC + Mybatis 연동
* SpringMVC 프로젝트에서 DB 연동을 하는데 아직까지 가장 많이 사용되는 방법
* 기본 설정과, DB 연결 Connection, SQL 부분을 작성하고, 기타 데이터변환등은 Mybatis 를 통하여 해결하는 방법

## Java 와 DB 연동하기
* Java 내부에서 사용하는 데이터를 DB 용 데이터로 변환
* DB 에서 전달된 데이터를 Java 변수 type 의 데이터로 변환
* Java 와 DBMS 서버간의 통신
* Java와 DB 연동하는데 근본적인 로직이 매우 어렵다
* 네트워크, 파일 등등의 지식이 없으면 구현 자체가 불가능 했다
* Java 는 DBMS 와 연동하기 위하여 `JDBC(Java Database Connection)` 이라는 표준 연결 도구를 선언하고, DBMS 소프트웨어를 만드는 회사들과 협조하여 DB 연동 개발 환경을 많이 개선시켰다
* 그럼에도 Java 개발자들은 DB 연동하는데 많은 어려움을 겪었다
* `MyBatis(iBatis)`라는 도구를 사용하게 되므로써 실질적으로 DB 연동을 위한 코드량이 1/3 이하로 줄어들게 되었다.

## Project 에 MyBatis 적용하기
```xml
   spring-jdbc
   mybatis
   mybatis-spring
   commons-dbcp2
   mysql-connector-java
```