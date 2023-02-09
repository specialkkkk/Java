package constructor;

import java.util.Scanner;

public class MemberService {
	Scanner scan = new Scanner(System.in); // 스캐너를 여기다 두면 전체에서 쓸 수 있다 //전역
	
	private MemberDTO[] ar = new MemberDTO[5]; //객체배열 DTO가 5개 들어온다
	
	
	
	public MemberService() {
	System.out.println(" 기본 생성자 ");	
	}
	
	public void menu(){
	
		
		int num;
		
		
		while(true) {
		System.out.println();
		System.out.println("*************** ");
		System.out.println("1. 가입 ");
		System.out.println("2. 출력 ");
		System.out.println("3. 수정 ");
		System.out.println("4. 탈퇴 ");
		System.out.println("5. 끝내기 ");
		System.out.println("*************** ");
		System.out.print("번호  :  ");
		num = scan.nextInt();
		
		if(num == 5) break; // while문 브레이크(벗어나라) 먼저

		if(num == 1) insertArticle();
		else if(num ==2) list();
		else if(num ==3) update();
		else if(num ==4) delete();
		
		
		
				
			
			
		
		
		
		
		}//while
	}//menu
	
	public void delete() {
		System.out.print("핸드폰 번호 입력 : ");
		String phone= scan.next();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(phone)) {
					ar[i] = null;
					
					System.out.println("삭제완료");
		
					break;
				}
			}
		}//for
		if(i == ar.length) System.out.println("찾는 회원이 없습니다");
		
	}
	
	public void update() {
		System.out.println("핸드폰 번호 입력 : ");
		String phone = scan.next();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(phone)) {
					System.out.println(ar[i].getName()+"\t"
							+ar[i].getAge()+"\t"
							+ar[i].getPhone()+"\t"
							+ar[i].getAddress());
					
					
					System.out.println();
					
					System.out.print("수정 할 이름 입력:");
					String name = scan.next();
					System.out.print("수정 할 핸드폰 입력:");
					phone = scan.next();
					System.out.print("수정 할 주소 입력:");
					String address = scan.next();
					
					ar[i].setName(name);
					ar[i].setPhone(phone);
					ar[i].setAddress(address);
					
					System.out.println("업데이트 완료");
					
					
					
					
					
					break;
				}
			}
		}//for i
		
		if(i == ar.length) System.out.println("찾는 회원이 없습니다");
	}
	
	public void list() {
		for(MemberDTO dto : ar) {
			if(dto != null) {
				System.out.println(dto.getName()+"\t"
									+dto.getAge()+"\t"
									+dto.getPhone()+"\t"
									+dto.getAddress());
				
				
				
				
			}
	}
}

	
	public void insertArticle() { //이름입력 ~ 주소입력 , "회원가입 완료"
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] == null) break;
		}
//		if(null이 1개도 없으면 i가 얼마로 탈출할까??)
//		if(i==5)
		if(i == ar.length) {
			System.out.println(ar.length + "명의 정원이 꽉 찼습니다");
			return; // 함수를 벗어나라
		}
		
		//		1.데이터 입력

		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		System.out.print("핸드폰 입력 : ");
		String phone = scan.next();
		System.out.print("주소 입력 : ");
		String address = scan.next();
		
//		2.MemberDTO 클래스 생성
		for(i=0; i<ar.length; i++) {
			if(ar[i] == null) {
				ar[i] = new MemberDTO(name, age, phone, address);
			
			break; //null 값을 찾으면 데이터를 생성하고 for을 벗어나라
			}
		}
		
		
		
		
		
		System.out.println("회원가입 완료 (1 row created)");
	}
}	
	



