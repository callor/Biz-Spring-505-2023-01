package com.callor.contact.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ContactDto {

	private Long c_uid;
	private String c_name;
	private String c_email;
	private String c_tel;
	private String c_addr;
	private String c_hobby;
	
}
