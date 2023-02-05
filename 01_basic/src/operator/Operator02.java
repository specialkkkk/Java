package operator;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오 :  ");
		int num = scan.nextInt();
		
		String result = num%2 == 0 ? "짝수" :  "홀수";
				      //num이 짝수야(2로 나누었을때 0이 나오면 짝수기 때문에) ?   참 : 거짓 ;
		
		String result2 = num%2 == 0 && num%3 == 0 ? "공배수이다" :  "공배수 아니다";
		               // num이 2와 3의 공배수야?
						// =num이 2로 나누면 나머지 0 이고 , 3로 나누면 나머지 0 ? 공배수
						// =num이 2로 나누어 떨어지고, 3으로 나누어 떨어진다
		
		
		
		                
		System.out.println(result);
		System.out.println(result2);
		
	}

}
