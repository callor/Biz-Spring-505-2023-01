# Simple WAS Project

## simple maven project 생성
* sts 에서 maven project 를 선택하여 project 생성
* `Create a simple project` 를 체크하고 프로젝트 생성 진행
* `Group id`, `Artifact id`를 설정 : project 의 base-package 를 설정하는 부분
```
Group id : com.callor
Artifact id : contact 

```
* artifact id : 는 project 의 context 이름이 된다.

## pom.xml 에 plug in 설정
* maven builder 를 사용할때 어떤 컴파일러 도구를 사용할 것인지를 설정하는 부분
```xml
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.8.1</version>
				<configuration>
					<source>15</source>
					<target>15</target>
					<compilerArgument>-Xlint:all</compilerArgument>
					<showWarnings></showWarnings>
					<showDeprecation></showDeprecation>
				</configuration>
			</plugin>
		</plugins>
	</build>
```

## pom.xml 에 spring framework 설정
* spring framework dependencies 가져오기
* dependency 의 version 정보를 properties 로 설정하기 위하여 아래와 같이 코드 변경
```<version>${org.springframework-version}```
```xml
	<dependencies>
		<!-- https://mvnrepository.com/artifact/org.springframework/spring-context -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>${org.springframework-version}</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-webmvc</artifactId>
			<version>${org.springframework-version}</version>
		</dependency>
	</dependencies>
```
* spring framework version properties 설정하기
```xml
	<properties>
	<org.springframework-version>5.2.22.RELEASE</org.springframework-version>
	</properties>
```	


