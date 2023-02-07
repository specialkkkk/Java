package for_;

import java.util.Random;
import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, dab, count=0;
		// count=0을 해서 초기화해야 에러가 안뜬다 
		
		for(int i=1; i<=5; i++) { //5문제
			
					
			
			
		
		Random random= new Random();
		a = random.nextInt(99) + 10; //10 ~ 99사이의 난수 발생;
		b = random.nextInt(99) + 10; //10 ~ 99사이의 난수 발생;
		
		//a = (int)(Math.random() * 90 + 10); //10 ~ 99 선생님 답
		//b = (int)(Math.random() * 90 + 10);
		 
				for(int j=1; j<=2; j++) { // 틀리면 기회를 1번 더
		
		System.out.print(" ["+ i +"] " + a + "+" + b + " = ");
		dab = scan.nextInt(); //dab = Scanner로 입력 받는다.
			
		
		
		if(a+b == dab ){//if(입력한 답 == 정답) 
			System.out.println("참 잘했어요"); 
			count++; // count를 넣었으니 {}로 구역을 잡아줘야함
			break; // for j를 벗어나라
				}
		else 
			if(j == 1) System.out.println("틀렸다");
			else if(j == 2) System.out.println("틀렸다 정답은 "+ (a+b));
				}//for j
				
	
		} //for     1문제를 for로 감싸서 5번 주면 =5문제....
		System.out.println();
		System.out.println("당신은 총 " + count + "문제를 맞혀서 점수 "+ count *20 + "점 입니다.");
		
		

		
		
		

	}

}
/*
[문제] 덧셈 문제
 2자리 숫자 ( 10 ~ 99 )만 제공한다
 5문제를 제공한다   < for >
 1문제당 20점씩 처리한다
 
 2번째 기회 = for문 어딘가에 넣어야함 , if틀리면 정답 알려주기/ 정답이면 넘어가 , break

[결과]
[1] a	   b
 87 + 56 = 78
 틀렸다
 
[1] 87 + 56 = 150
틀렸다 . . . 정답은 143
 
[2]

[2] 

[3]


[4]


[5]


당신은 총 X문제를 맞혀서 점수 xx점 입니다.
      count          count * 
 
*/