package operator;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		double b = (double)a / 3;
		//Casting  강제형변환하면  3.0을 3으로 자동형변환
		
		String c = "25";
		
		//int d = c; // d는 기본형   ,    c는 객체형 String 타입이기때문에 못들어감 
		// int d = (int)c;   c를 int로 강제형변환하면 되지않나?안됨. =메소드가 필요하다
		
		
		int d = Integer.parseInt(c); //  똑같은 int의 메소드(parseInt)를 통해서 바꾼다. 
		
		int e = 5;
		
		Integer f = e; //JDK 5.0, AutoBoxing (기본형 -> 객체형)
		//객체형	  = 기본형
				
		//Integer f = new Integer(e); // JDk 5.0 이전에 쓰던 것 (deprecate)
		
		Integer g = 5;
		int h = g; //JDK 5.0 unAutoBoxing (객체형 -> 기본형) 오토박싱과 반대
		//int h = g.intValue(); //JDK 5.0 이전
		
		
		
	
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
