package com.callor.contact.models;
/*
 * 사용자 관리를 하기위한 클래스
 */
public class UserVO {
	
	private String username;
	private String password;
	private String name;
	private String email;
	private String role;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "UserVO [username=" + username + ", password=" + password + ", name=" + name + ", email=" + email
				+ ", role=" + role + "]";
	}
	
	
	
	
	

}
