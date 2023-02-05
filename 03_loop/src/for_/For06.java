package for_;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		int x , mul = 1, sum = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.print("숫자 입력 : ");
		x = scan.nextInt();
		
		for(x=1; x<=10; x++) { //i는 1부터 10까지
			sum += x; 
			mul *= x; //mul = mul * i
		System.out.println(x + "!" + "  =  " + mul + (sum));
		
		
			
			
		}
		

	}

}



	



/*
[문제] 팩토리얼을 구하시오 (for)
 입력되는 숫자는 1 ~10 사이만 입력한다.

[실행결과]
숫자 입력 : 3
3! = 6 (1*2*3)
---------------

숫자 입력 : 5
5! = 120 (1*2*3*4*5)
 */
