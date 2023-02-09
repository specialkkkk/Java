package constructor;

public class a____VarArgs {
	public a____VarArgs() {
		System.out.println("기본 생성자");
	
	}

	
	
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	/*
	  
	  
//	return형 메소드명(인수형 인수, 인수형 인수, 인수형 인수) {
//	}	
//	=>
	
	int sum(int a, int b) {  	//정수 (int a, b) 이렇게 묶어서 쓸 수 없다
		return a+b;
	}
	

	int sum(int a, int b, int c) {  //하는 일은 똑같은데 개수가 달라서 따로 써야함	
		return a+b+c;
	}
	
	int sum(int a, int b, int c, int d) {  	//하는 일은 똑같은데 개수가 달라서 따로 써야함
		return a+b+c+d;
	}
	
	
	*/	
//	 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
//  ...배열로 만들기 =>
		int sum(int...ar) {  	// ... = 개수를 자유롭게 주겠다
			int hap=0;
			for(int i=0; i<ar.length; i++) {
				hap += ar[i];
			}
			return hap;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		a____VarArgs va = new a____VarArgs();
		
		System.out.println("합 = " + va.sum(10,20));
		System.out.println("합 = " + va.sum(10,20,30));
		System.out.println("합 = " + va.sum(10,20,30,40));
		
		
		
		
		

	}

}
