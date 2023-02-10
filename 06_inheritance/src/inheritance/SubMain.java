package inheritance;
// 자식 클래스 메모리 생성할 때 =부모 클래스를 생성+ 자식클래스 생성
public class SubMain extends Super {
	private String name;
	private int age;
	
	
	SubMain(){
		System.out.println("SubMain 기본 생성자");
	}
	SubMain(String name, int age, double weight, double height){
		this.name = name;
		this.age = age;
		super.weight = weight; 
		this.height = height;
		//this 는 내 값  super는 부모클래스의 참조 값
	
	}
	
	public void output() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		
		// 위처럼 일일이 안쓰고 부모꺼를 불러와도 됨 (disp=몸무게,키)
		this.disp(); // 부모꺼 인데도 내거처럼 쓸 수 있다
		//= disp();   * this 빼도 된다
	}
	
	public static void main(String[] args) {
		SubMain aa = new SubMain("홍길동", 25, 73.5, 182.6);
		aa.disp(); //부모 메소드 호출
		System.out.println("---------------");
		aa.output();
		System.out.println("===============");
		
		Super bb = new SubMain("코난", 13, 53.5, 156.6);
        //bb.output();  = error
		bb.disp();
		
		
	}

}



