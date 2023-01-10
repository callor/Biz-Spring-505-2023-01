package com.callor.user.models;

/**
 * 사용자 정보를 저장할 객체를 생성하기 위한
 * 클래스 작성
 * 작성된 클래스 소스를 class prototype 이라고 한다
 * 로그인과 회원가입을 하기 위해 필요한 사용자정보
 * 

 * VO(Value Object) = Dto(Data Transfer Object)
 * 별도의 연산 없이 데이터만을 위한 클래스
 * 
 * 로그인ID, 비밀번호, 실명, 닉네임, 이메일, 전화번호
 */
public class UserVO {

	/**
	 *  Java 변수 선하기
	 *  변수의 Type 키워가 항상 먼저 나온다
	 *  변수명은 첫글자 소문자, 이후 영문대소문자 숫자, _ 합성
	 *  가급적 _ 보다는 두개 이상의 단어를 조합하고 Camel Case 로성
	 *  
	 *  VO 클래스의 각 요소(칼럼,property, 속성)들은
	 *  기본 설정으로 private 으로 접근제한을 한다
	 *  private 으로 설정된 각 요소는 다른 곳에서 직접 접근이 불가능하다
	 *  직접 접근이 불가능 하도록 하는 것은
	 *  혹시 모를 데이터의 변형이 발생하는 것을 방지하는 목적이다
	 *  
	 *  이 설정은 객체지향에서 정보은닉이라고 한다.
	 *  은닉된 각 속성에 접근하기 위하여 getter와 setter 를 만들어준다
	 *  setter 는 데이터를 변수에 할당(저장)하기 위해 사용하고
	 *  getter 는 변수에 저장된 값을 외부에서 사용하기 위함이다
	 *  
	 *  
	 */
	private String username; // 문자열형 변수
	private String password;
	private String realname ;
	private String nickname;
	private String email;
	private String tel;
	private int age; 		// 정수형 숫자 변수
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	public int getAge() {
		return age;
	}
	
	/**
	 * age 변수에 값을 저장하는데
	 * 0 세 부터 100까지만 저장을 하도록 강제하고 싶다 
	 * 누가 어떤 경우든지 0세 부터 100세 범위를 벗어나는
	 * 데이터를 age 에 저장하려고 하면
	 * 무조건 0으로 처리하라
	 */
	public void setAge(int age) {
		if(age < 0 || age > 100) {
			this.age = 0;
		} else {
			this.age = age;	
		}
	}
	
	/**
	 * 기본형 변수를 선언하는 키워드
	 * 단순히 데이터를 저장하는 용도로만 사용
	 * 		int : 정수형
	 * 		float : 단정도 실수
	 * 		double : 배정도 실수
	 * 		long : 큰 정수형
	 * 		boolean : 블린형
	 * 
	 * wrapper class 형 변수를 선언하는 키워드
	 * 변수에 확장기능을 지원하는 용도
	 * 		Integer : 정수형
	 * 		Float : 단정도 실수
	 * 		Double : 배정도 실수
	 * 		Long : 큰 정수형
	 * 		Boolean : 블린형
	 * 
	 */
	
	
	
	
	
	
	
}



