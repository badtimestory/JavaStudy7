package com.iu.s1.human;

import java.util.List;

/*
 * 
 * 주소록에 있는 모든 view를 출력
 * @ 22.01.04
 * 
 * 
 * */
public class ContactsView {
	
	// 문자열을 받아서 출력하는 메서드 
	
	// 한 사람의 정보를 출력하는 메서드
	// 정보가 있으면 출력, 없으면 정보가 없음 출력
	public void View(ContactsDTO cDTO) {
		if (cDTO != null) {
			System.out.println("이름: " + cDTO.getName());
			System.out.println("별명: " + cDTO.getNickName());
			System.out.println("이메일: " + cDTO.getEmail());
			System.out.println("전화번호: " + cDTO.getPhoneNum());
			System.out.println("생일: " + cDTO.getBirth());
		} else {
			System.out.println("정보가 없습니다.");
		}
	}
	
	public void view(List<ContactsDTO> ar) {
		for (int i = 0; i < ar.size(); i++) {
			ContactsDTO cDTO = ar.get(i);
			System.out.println("이름: " + cDTO.getName());
			System.out.println("별명: " + cDTO.getNickName());
			System.out.println("이메일: " + cDTO.getEmail());
			System.out.println("전화번호: " + cDTO.getPhoneNum());
			System.out.println("생일: " + cDTO.getBirth());
		}
	}

}
