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
		
		
		
	}

}