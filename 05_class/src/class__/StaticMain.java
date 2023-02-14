package class__;

class StaticTest{
	private int a; //필드, 초기화  => garbage값이 없다   / 인스턴스 변수
	private static int b; //필드 /static   = 클래스 변수 (new 안해도 된다)
		//  static = 우리집 사는 친척 (가족은 아님)

	static { 
		System.out.println("초기화 영역");
		StaticTest.b = 5;
	}
		
	public StaticTest() {
		System.out.println("기본 생성자");
		this.a = 5;
	
		
	}
	public void calc() {
		a++;
		b++;
	}

	public void disp() {
		System.out.println("a = " + this.a + " b = " + StaticTest.b);
		
	}

	public static void output() {
		System.out.println("static method. . . ");
//		System.out.println("a = " + this.a + " b = " + b); // this 사용 불가능
		// 에러 이유 = static 메소드 안에서는 static 변수만 사용 가능 
	}
	
	
}



//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
public class StaticMain {
	
	

	public static void main(String[] args) {
		StaticTest aa = new StaticTest();
		aa.calc(); // calc에 ++이 있으니까
		aa.disp();// disp의 5  
		// 결과 => 5 ++  =>  6
		System.out.println();
		
		StaticTest bb = new StaticTest();
		bb.calc(); // 
		bb.disp();//   
		System.out.println();
			
		StaticTest cc = new StaticTest();
		cc.calc(); //
		cc.disp();//  
		System.out.println();		
		
		StaticTest.output(); //클래스명.메소드()
		aa.output();//객체,메소드()
		
	}

}
