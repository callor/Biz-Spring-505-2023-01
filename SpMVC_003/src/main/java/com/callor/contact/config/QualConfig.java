package com.callor.contact.config;

/*
 * 이 클래스를 Qualifier 를 설정할때
 * 매직문자열을 사용했을 때 발생하는 오타에 의한 오류를
 * 최소한으로 줄이기 위한 초기값 변수를 설정하는 곳이다
 * 
 * 클래스와 변수에 static 키워드가 있다
 * static 키워드가 부착된 클래스와 변수는
 * 프로젝트 start 될때 만들어져서
 * 별도의 객체를 생성하지 않고
 * 어디에서든지 값을 참조 할수 있다.
 * 이러한 변수들은 static 과 final 을 부착한다
 * 
 * 프로젝트 전체에서 사용할 변수를 미리 선언해 놓는 것이다
 */
public class QualConfig {
	public static class ADDR {
		public static final String SERVICE_V1 = "addrServiceV1";
		public static final String SERVICE_V2 = "addrServiceV2";
	}
	public static class USER {
		public static final String SERVICE_V1 = "userServiceV1";
		public static final String SERVICE_V2 = "userServiceV2";
	}
}

