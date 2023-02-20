package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MemberService {// menu를 쓰기때문에 implements Member 안한다..
	private List<MemberDTO> list = new ArrayList<MemberDTO>(); //부모 = 자식    인터페이스=List   >   클래스=ArrayList
		  //Arraylist<어쩌구> 써야 어쩌구안에것만 들어옴

			//Arraylist안에 1인분(DTO)를 넣고 => while문
	public void menu() {
		
		Scanner scan = new Scanner(System.in);
		Member member = null; //부모 // 리모콘 // 다형성  밑에 if문에 insert, list, delete 일일이 안써줘도 됨
		                      //=인터페이스 잡아주기
		int num;
		
		
		while(true) {
			System.out.println();
			System.out.println("***********");
			System.out.println("    1. 등록");
			System.out.println("    2. 출력");
			System.out.println("    3. 핸드폰 검색");
			System.out.println("    4. 이름으로 오름차순");
			System.out.println("    5. 파일 저장");
			System.out.println("    6. 파일 읽기");
			System.out.println("    7. 종료");
			System.out.println("***********");
			System.out.println(" 번호  :  ");
			num = scan.nextInt();
			
			if(num == 7 )break;
			
			if(num == 1)  member = new MemberInsert();
			else if (num == 2) member = new MemberPrint();
			else if (num == 3) member = new MemberPhoneSearch(); 
			else if (num == 4) member = new MemberNameAsc();
			else if (num == 5) member = new MemberFileOutput();
			else if (num == 6) member = new MemberFileInput();
			

			
			
			
			else {
				System.out.println("1~7 번 까지만 입력하세요"); 
				continue; // 다시 첨부터 시작 (while부터)
			}
			
			member.execute(list);  //호출/  
		}//while
	
		
	} //menu

}



/*

package member;

import java.util.Collections;
import java.util.List;

public class MemberNameAsc implements Member {

	@Override
	public void execute(List<MemberDTO> list) {
		Collections.sort(list);
		
		System.out.println("이름\t나이\t핸드폰\t\t주소");
		for(MemberDTO memberDTO : list) {
			System.out.println(memberDTO);
		}//for
	}

}




 */
 

