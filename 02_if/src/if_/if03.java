package if_;

import java.util.Scanner;

public class if03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
				
		System.out.print("a의 값 : ");
		int a = scan.nextInt();
			
		
		System.out.print("b의 값 : ");
	    int b = scan.nextInt();
	    
	    
	    System.out.print("c의 값 : ");
	    int c = scan.nextInt();
	    
	    
	    if(a<b && a<c) { //a가 가장 작은 경우
	    	if(b<c) System.out.println(a + ", " + b + ", " + c);
	    	else System.out.println(a + " , " + c + ", " + b);
	    	
//	    	
//	    	//위의 a가 가장 작습니까 하고 내려왔다 그다음 (b<a)를 쓸 필요 X 
//	    }else if(b<c) { //b가 가장 작은 경우
//	    	if(a<c) System.out.println(b + ", " + a + ", " + c);
//	    	else System.out.println(b + ", " + c + ", " + a);
//	    }else { // c가 가장 작은 경우
//	    	if(a<b) System.out.println(c + ", " + a + ", " + b);
//	    	else System.out.println(c + ", " + b + ", " + a);
	    }
	    
	}

}
	    
	    
	    
//	    if(a가 가장 작습니까) {
//	    	if(a가 빠지고 b와 c중에서 b가 작습니까) System.out.println(a + ", " + b + ", " + c);
//	    	else System.out.println(a + " , " + c + ", " + b);
//	    	
//	    
//	    }else if(b가 가장 작습니까?) {
//	    	if()
//	    	else
//	    }else if(c가 가장 작습니까?)

	    
	    
	    
	    
	    
	    
	    

/*
[문제] 3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오 (if문 사용하시오)

[실행결과]
a의 값 : 98
b의 값 : 90
c의 값 : 85

85 90 98
---------------------
a의 값 : 75
b의 값 : 25
c의 값 : 36

25 36 75  
 
 */
