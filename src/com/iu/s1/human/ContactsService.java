package com.iu.s1.human;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class ContactsService {
	
	private Scanner sc;
	
	public ContactsService() {
		sc = new Scanner(System.in);
	}
	
	// 이름을 입력받아서 같은 이름이 있는 ContactsDTO의 인덱스 번호 찾기
	// 찾아서 삭제
	// 리턴 삭제여부	0: 성공, 1: 실패
	public boolean removeContacts(List<ContactsDTO> ar) {
		System.out.print("삭제할 이름을 입력하세요: ");
		String name = sc.next();
		
		boolean result = false;
		
		ContactsDTO cDTO = null;
		
		for (int i = 0; i < ar.size(); i++) {
			if(name.equals(ar.get(i).getName())) {
				
				cDTO = ar.get(i);
				
				//result = ar.remove(ar.get(i));
				
				// cDTO = ar.remove(i);
				// result = true;
				break;
			}
		}
		return ar.remove(cDTO);
	}

	// 이름을 입력받아서 같은 이름이 있는 ContactsDTO 찾아서 리턴
	public ContactsDTO searchContacts(List<ContactsDTO> ar) {
		System.out.print("이름 입력하세요: ");
		String name = sc.next();
		
		// 못찾으면 null
		ContactsDTO cDTO = null;
		
		// 찾으면 값을 넘겨줌
		for (int i = 0; i < ar.size(); i++) {
			if(name.equals(ar.get(i).getName())) {
				cDTO = ar.get(i);
				break;
			}
		}
		
		return cDTO;
		
//		if(name == cDTO.getName()) {
//			System.out.println("같은 이름이 존재합니다.");
//			return cDTO;
//		} else {
//			System.out.println("해당 이름이 존재하지 않습니다.");
//			return null;
//		}
		
	}
	
//	내가 생각해보면 view 구상 코드
//	public void contactsInfo() {
//		ContactsDTO cDto = new ContactsDTO();
//		ArrayList<ContactsDTO> ar = new ArrayList<>();
//		System.out.println("이름: " + cDto.getName());
//		System.out.println("별명: " + cDto.getNickName());
//		System.out.println("이메일: " + cDto.getEmail());
//		System.out.println("전화번호: " + cDto.getPhoneNum());
//		System.out.println("생일: " + cDto.getBirth());
//		System.out.println();
//	}

	public ContactsDTO addContacts() {
		ContactsDTO cDto = new ContactsDTO();
		System.out.print("이름을 입력해주세요: ");
		cDto.setName(sc.next());
		System.out.print("별명을 입력해주세요: ");
		cDto.setNickName(sc.next());
		System.out.print("이메일을 입력해주세요: ");
		cDto.setEmail(sc.next());
		System.out.print("전화번호를 입력해주세요: ");
		cDto.setPhoneNum(sc.next());
		System.out.println("생일을 입력해주세요: ");
		cDto.setBirth(sc.next());
		
		return cDto;
	}

}
