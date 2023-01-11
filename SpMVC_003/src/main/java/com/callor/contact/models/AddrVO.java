package com.callor.contact.models;

/**
 * 주소록 관리
 * 
 * id, 이름, 전화번호, 주소, 관계
 *
 */
public class AddrVO {
	private String ad_id;
	private String ad_name;
	private String ad_tel;
	private String ad_address;
	private String ad_chain;
	
	// private 으로 설정된 속성변수(맴버변수)들에
	// 접근하기 위한 getter, setter method
	public String getAd_id() {
		return ad_id;
	}
	public void setAd_id(String ad_id) {
		this.ad_id = ad_id;
	}
	public String getAd_name() {
		return ad_name;
	}
	public void setAd_name(String ad_name) {
		this.ad_name = ad_name;
	}
	public String getAd_tel() {
		return ad_tel;
	}
	public void setAd_tel(String ad_tel) {
		this.ad_tel = ad_tel;
	}
	public String getAd_address() {
		return ad_address;
	}
	public void setAd_address(String ad_address) {
		this.ad_address = ad_address;
	}
	public String getAd_chain() {
		return ad_chain;
	}
	public void setAd_chain(String ad_chain) {
		this.ad_chain = ad_chain;
	}
	
}
