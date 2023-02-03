package for_;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int mul = 1;
		
		System.out.print("x의 값 : ");
		int x = scan.nextInt();
		
		System.out.print("y의 값 : ");
		int y = scan.nextInt();
			
		for(int i=1; i<=y; i++) { 
			mul *= x;    //mul = mul * x
		}
			System.out.println(x + "의" + y + " 승은" + mul);
		//누굴 곱하고 누굴 반복하는지
		
	
	}
}

/*
[문제] 제곱 계산 = x의 y승  
                        
x값 입력 : 2
y값 입력 : 5

2의 5승은 32
----------------------
x값 입력 : 3
y값 입력 : 4

3의 4승은 81


*/