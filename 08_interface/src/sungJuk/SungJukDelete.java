package sungJuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner scan = new Scanner(System.in);
		int i;
		System.out.print("삭제할 이름 입력 : ");
		String name = scan.next();
		int count=0;
	/*	
		Iterator<SungJukDTO> it = arrayList.iterator();
		while(it.hasNext())	{ 
		  SungJukDTO sungJukDTO	= it.next();//it에서 항목을 가져와라 -> sungJtkDTO에 보관해라
		  
		  if(sungJukDTO.getName().equals(name)) {
			  it.remove(); //현재위치의 it를 지우는게 아니라 it.next로 보관된 내용을 지우는 것
			  count++;
		  }	
		  
		  
		} //while 
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		for(i=0; i<arrayList.size(); i++) {
			if (!name.equalsIgnoreCase(arrayList.get(i).getName())) continue;
			else break;
		}
		if(i == arrayList.size()) {
			System.out.println("회원의 정보가 없습니다");
			return;
		}
		
		while(true) {
			for(i=0; i<arrayList.size(); i++) {
				if(name.equalsIgnoreCase(arrayList.get(i).getName())) {
					arrayList.remove(i);
					break;
				}
				else if (!name.equalsIgnoreCase(arrayList.get(i).getName())) continue;
			}
			if(i == arrayList.size()) {
				break;
			}
		}//while
		System.out.println("삭제하였습니다.");
		
		
		
		
	}

}