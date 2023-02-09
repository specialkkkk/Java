package class_;


class This {
	private int b; //필드
	private static int c; // static 으로 잡는다는 것은 식당의 시음식과 같다
	
	
	
	
	public void setB(int b) {  //b를 setB(임의로) 함수의 구현 , 인수(argument), 매개변수(parameter)
//		   void = 반환값이 없다 (return이 없다)
		System.out.println("this = " + this);
		this.b = b; //this를 써줘야 함
	}

	public void setC(int c) {	
		this.c= c;
		}
		
		
		
	
//		<get>ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
	public int getB(){
//		get은 반환값이 있다	 = b가 int이니 void말고  int써줌
		return b;
		}
	
	public int getC() {
		return c;
	}
		
		
		
		
		
	
}


//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

public class ThisMain { //메뉴판 , 모든 클래스는 반드시 ★생성★ = 주문 = new     해야 한다.
	private int a; //필드 
	
	
	
	public static void main(String[] args) { 
		ThisMain tm = new ThisMain();
		tm.a = 10;
		System.out.println("a = " + tm.a);   // 클래스 안의 a는 출력이 되지만
		
//		System.out.println("b = " + tm.b);   //  "This" class의 b는  다른 클래스라 출력이 안됨
		
//		=> new 써서 This 클래스를 불러옴
//		This t = new This();
//		t.b = 20;
//		System.out.println("b = " + tm.b);   => b가 인식이안된다 => setter/ getter 써야함
		
//		=>
		This t = new This();     //라면 1 주문
		System.out.println("객체 t = " + t);
		t.setB(20); //호출 = 호출한 메소드는 반드시 돌아온다
		System.out.println("t.b = " + t.getB());
		
		
		t.setC(30);
		System.out.println("t.c = "+ t.getC());
		
		
		This w = new This();      // 라면 2  주문
		System.out.println("객체 w = " + w);
		w.setB(40);		
		w.setC(50);
		System.out.println("w.b = " + w.getB());
		System.out.println("w.b = " + w.getC());
		
		
		
		
		
		
		
		
		
		
		
	}
}