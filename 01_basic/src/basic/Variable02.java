package basic;

class Test {
	int a = 10;
	static int b = 20; // static 은 시음식 ( 갖다써라)
	static String str;
}


//-----------------------------------------------------------------
public class Variable02 { //클래스의 Variable02는 메뉴판이면
	int a; // 필드, 전역변수 = 값이 0
	double b; // 필드 ,실수형8byte
	static int c; // 미리 만들어 놓은 음식

	public static void main(String[] args) {
		int a=5; //지역변수(local variable)=garbage 쓰레기 기본값을 가지고 있다
		System.out.println("지역변수 a = " + a);
		
		Variable02 v = new Variable02();//메모리 생성, 음식을시킴(new)
		System.out.println("객체 = " + v); //결과 = basic.Variable02@515f550a (주소)
		System.out.println("필드 a = " + v.a);  // 0
		System.out.println("필드 b = " + v.b);  //  0.0 (실수형)
		
		System.out.println("필드 b = " + c);// 밑줄이랑 같음 , 미리 만들어 놓은 음식이라 생략가능
		System.out.println("필드 b = " + Variable02.c);  // 원래는 이렇게
		
		//Test클래스의 a 값을 출력하시오
		Test t = new Test();
		System.out.println("Test class a = " + t.a);
		System.out.println("Test class b = " + Test.b);
		System.out.println("Test class str = " + Test.str);
		
	}

}
