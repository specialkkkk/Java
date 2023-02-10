package inheritance;

public class Super extends Object { //object가 상속이다
	protected double weight, height;
	
	Super(){
		System.out.println("Super 기본 생성자");
	}
		
	Super(double weight, double height) {//생성자   void 쓰면 안된다.
		this.weight = weight;
		this.height = height;
	
	}
    
	
	public void disp( ) {
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
		
	}
	
	
	
}


