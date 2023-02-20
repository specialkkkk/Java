package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MemberInsert implements Member {
	@Override
	public void execute(List<MemberDTO>list) { //메소드
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = scan.next();
		
		System.out.println("나이 입력 : ");
		int age = scan.nextInt();
		
		
		System.out.println("폰 번호 입력 : ");
		String phone = scan.next();
		
		
		System.out.println("주소 입력 : ");
		String adrress = scan.next();
		
		
		
		
		
		MemberDTO memberDTO = new MemberDTO(name, age, phone, adrress); //1인분 데이터[ 보관 ] //순서중요!!!
		
		list.add(memberDTO); //크기가 가변적인 배열을 구현한 클래스
		
		System.out.println("입력하였습니다");
}
}
