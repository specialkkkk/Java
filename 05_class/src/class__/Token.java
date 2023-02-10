package class__;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원, 집, 게임방";  
		
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("토큰 개수 = " + st.countTokens());
		// 토큰 개수 = 3
		
		while(st.hasMoreTokens()) { //while( 토큰 유(True) or 무(False)) 
			System.out.println(st.nextToken()); //토큰을 꺼내고 다음 토큰으로 이동
	}//while
	  System.out.println("----------------");
	  
	  String[] ar = str.split(",");
	  
	  for(String data : ar) {
		  System.out.println(data); //학원 집 게임방 
	  }
		
	}
}
