package exception;

import java.util.Scanner;

public class ExceptionMain2 {
	private int x, y; //int x ,y 빼줌
	
	
	public void input() {
	Scanner sc = new Scanner(System.in);
	
    System.out.print("x 입력: ");
    x = sc.nextInt();
    System.out.print("y 입력: ");
    y = sc.nextInt();
	}
	
	public void output() {
		if(y >= 0) {
		int mul = 1;
		for(int i=1; i<=y; i++) {
			mul *= x;
		}//for
		
		System.out.println(x + "의 " + y + "승은 " + mul);
		
	}else {
//		System.out.println("y는 0보다 크거나 같아야 한다."); 
		
		//원래 에러가 나오지 않는 부분이지만 확실하게 보여주기위해 개발자가 강제로 Exception 발생 
		try {
				
		throw new Exception("y는 0보다 크거나 같아야 한다."); 
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
	
	
	
public static void main(String[] args) {
		ExceptionMain2 exceptionMain2 = new ExceptionMain2();
		exceptionMain2.input();
		exceptionMain2.output();
	
	
	
	
	
	}
}







	/*public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("x 입력: ");
	        int x = sc.nextInt();
	        System.out.print("y 입력: ");
	        int y = sc.nextInt();

	        int result = 1;
	        for (int i = 1; i <= y; i++) {
	            result *= x;
	        }

	        System.out.println("----------------------------------");
	        System.out.printf("%d의 %d승은 %d입니다.\n", x, y,  result);
	    }
	}
	/*	
	



/*
[문제] 제곱 연산
- x의 y승을 처리 한다. 
- for문을 이용하여 처리한다.

[실행결과]
x 입력 : 2
y 입력 : 10         input()
----------------------------------
2의 10승은 xxx        output()
*/
