/* EX)
 
Class Test{
			int a;
			
			
			public Test(int a ) {} // 클래스와 똑같은것 = Test = 생성자
			
			
			public Test() // default 생성자
			      = 생성자에 void 쓰면 안된다
			public void setA(int a) { 어쩌구 }
			      (void =return X  = 결과형  )    
*/



package constructor;

public class ConstructorMain {
	private String name;
	private int age;
	
	public ConstructorMain() {                      // 생성자 Overload (쌍둥이)
		System.out.println("default 생성자");
	}
	
	public ConstructorMain(String name) {   		 // 생성자 Overload (쌍둥이)
		this();   // Overload된 다른 생성자를 호출할 수 있다
		System.out.println("name 처리 생성자");
		this.name = name;
	}
	
	public ConstructorMain(int age) {   		 // 생성자 Overload (쌍둥이)
		this("코난"); //Overload된 다른 생성자를 호출할 수 있다 //public ConstructorMain(String name) 호출
//												주의:첫줄에 써야함
		System.out.println("age 처리 생성자");
		this.age = age;
		
	}

	
	
	
	
	public static void main(String[] args) {
		ConstructorMain aa = new ConstructorMain();  
		System.out.println(aa.name + "\t" + aa.age);
		System.out.println();
		
		ConstructorMain bb 	= new ConstructorMain("홍길동"); 
		System.out.println(bb.name + "\t" + bb.age);
		System.out.println();

		
		ConstructorMain cc 	= new ConstructorMain("25");
		System.out.println(cc.name + "\t" + cc.age);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
