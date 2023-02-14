package sungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		
//		<1번째 방법>
//		for(int i=0; i<arrayList.size(); i++) {
//			System.out.println(arrayList.get(i).getNo()+ "\t"
//							+  arrayList.get(i).getName() + "\t"
//							+  arrayList.get(i).getKor() + "\t"
//							+  arrayList.get(i).getEng() + "\t"
//							+  arrayList.get(i).getMath() + "\t"
//							+  arrayList.get(i).getTot() + "\t"
//							+  arrayList.get(i).getAvg() + "\t");
//		}//for
		
	
	
//	      <2번째 방법>
//		for(SungJukDTO sungJukDTO : arrayList) {
//			System.out.println(sungJukDTO.getNo() + "\t"
//							sungJukDTO.getName()+ "\t"
//							~~~~~get avg까지);}
			
			
//		 <3번째 방법> //override 활용
		for(SungJukDTO sungJukDTO : arrayList) {
			System.out.println(sungJukDTO);//클@16진수
		}
	
		
		
			
	}

}

	
