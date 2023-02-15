package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {
	
	
		@Override
		public void execute(ArrayList<SungJukDTO> arrayList) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("번호 입력 : ");
		int no = scan.nextInt();
		
		int i;
		for(i=0; i<arrayList.size(); i++) {
			if(arrayList.get(i).getNo() == no) break;
		}//for  / i가 0, 1, 2
		
		if(i == arrayList.size())
			System.out.println("없는 번호 입니다");
		else
			System.out.println(arrayList.get(i));
		
		System.out.println();
		System.out.println("수정할 이름 입력 : ");
		String name = scan.next();
		System.out.println("수정할 국어 입력 : ");
		int kor = scan.nextInt();
		System.out.println("수정할 영어 입력 : ");
		int eng = scan.nextInt();
		System.out.println("수정할 수학 : ");
		int math = scan.nextInt();
		
		sungJukDTO.setName(name);
		sungJukDTO.setKor(kor);
		sungJukDTO.setEng(eng);
		sungJukDTO.setMath(math);
		
		sungJukDTO.calc; //재계산
		System.out.println("수정하였습니다");
		
		
	}

}