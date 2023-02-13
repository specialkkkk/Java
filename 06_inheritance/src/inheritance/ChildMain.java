package inheritance;

public class ChildMain extends Super {
	private String name;
	private int age;
	
	
	ChildMain(){
		System.out.println("ChildMain 기본 생성자");
	}
	ChildMain(String name, int age, double weight, double height){
		super(weight, height); //부모 생성자 호출 // 첫줄에 써야함.
		
		
		this.name = name;
		this.age = age;
		//super.weight = weight; 
		//this.height = height;
		//this 는 내 값  super는 부모클래스의 참조 값
	
	}
	
	public void disp() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		
		// 위처럼 일일이 안쓰고 부모꺼를 불러와도 됨 (disp=몸무게,키)
		super.disp(); // this X  super O
	}
	
	
	
	
	
	public static void main(String[] args) {
		ChildMain aa = new ChildMain("홍길동", 25, 73.5, 182.6);
		aa.disp();
		System.out.println("=============");
		
		Super bb = new ChildMain("코난",13,63.5,162.6 );
		bb.disp();
		
		
	}

}
