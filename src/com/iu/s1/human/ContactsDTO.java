package com.iu.s1.human;

import java.util.Calendar;

public class ContactsDTO {

	private String name;		// 이름
	private String nickName;	// 별명
	private String email;		// 이메일
	private String phoneNum;	// 전화번호
	private Calendar birth;		// 생일
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Calendar getBirth() {
		return birth;
	}
	public void setBirth(Calendar birth) {
		this.birth = birth;
	}

	
	
}
