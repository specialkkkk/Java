package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;


public class SungJukService {
	private ArrayList<SungJukDTO> arrayList = new ArrayList<SungJukDTO>();
	//Arraylist<어쩌구> 써야 어쩌구안에것만 들어옴

	public void menu() {
		
		Scanner scan = new Scanner(System.in);
		SungJuk sungJuk = null; //부모 // 리모콘 //  밑에 if문에 insert, list, delete 일일이 안써줘도 됨
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("***********");
			System.out.println("    1.  입력");
			System.out.println("    2.  출력");
			System.out.println("    3.  수정");
			System.out.println("    4.  삭제");
			System.out.println("    5.  정렬");
			System.out.println("    6.  끝");
			System.out.println("***********");
			System.out.println(" 번호  :  ");
			num = scan.nextInt();
			
			if(num == 6 )break;
			
			if(num == 1) sungJuk = new SungJukInsert();
			else if (num == 2) sungJuk = new SungJukList();
			else if (num == 3);
			else if (num == 4);
			else if (num == 5);
			else {
				System.out.println("1~6 번 까지만 입력하세요"); 
				continue; // 다시 첨부터 시작 (while부터)
			}
			
			sungJuk.execute(arrayList);  //호출
		}//while
	
		
	}
}
