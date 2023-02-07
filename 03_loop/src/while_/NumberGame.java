package while_;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com , user, count=0;
		
		while(true) {
				com = (int)(Math.random() * ((100-1+1)+1));  // * (Y-x+1)+x)  난수 발생
				  //  math.random() * 100 = 0~ 99   ★난수가 0.어쩌구 부터 시작이기떄문에 
				  //  math.random() * 100 + 1 = 1 ~ 100
				//System.out.println(com); 정답보기 
				
							
				
				
				
				
				System.out.print("1 ~ 100사이의 숫자를 맞추세요 " );
				System.out.println();
				
				
				
				while(true) {
					System.out.println("숫자 입력 : ");
					user = scan.nextInt();
					count++; // count = count + 1  //  현재 카운트가 쓰레기값을 가지고 있기때문에 0으로 초기화시키자.
					if(com == user) break;
					
					if(com > user) System.out.println(user + "보다 큰 숫자입니다.");
					else if(com < user)System.out.println(user + "보다 작은 숫자입니다.");
					
				}//while
				
				System.out.println("\n 딩동댕. . .  " + count + "번만에 맞추셨습니다.");
				
				System.out.print("\n 한번 더 (y/n) : ");
				// int yn = scan.nextInt(); // y  or  n
				String yn = scan.next(); // int yn 이랑 같다.  선택
				
				// if(yn == 'n' || yn == 'N') break;  //  ||은 or연산  int yn 했을시에 이렇게 쓰자
				
				//if(yn == "n" || yn == "N") break; // 문자열을 비교할때는 ==을 쓰면 알파벳의 주소를 찾는다
				if(yn.equals("n") || yn.equals("N")) break; // 문자열비교 = equals를 쓴다							
		}//while
		
		System.out.println("프로그램을 종료합니다.");
	}

}

/*
[문제] 숫자 맞추기 게임
- 컴퓨터가 1 ~ 100사이의 난수를 발생하면, 발생한 난수를 맞추는 게임
- 몇 번만에 맟주었는지 출력한다.

[실행결과]
1 ~ 100사이의 숫자를 맞추세요 (70)

숫자 입력 : 50
50보다 큰 숫자입니다.

숫자 입력 : 85
85보다 작은 숫자입니다.

~~~

숫자 입력 : 70
딩동뎅...x번만에 맞추셨습니다.

한번 더 (y/n) : 


한번더 y 경우

1 ~ 100사이의 숫자를 맞추세요 (30)

숫자 입력 : 50
50보다 ~~입니다.

숫자 입력 : 85
85보다~~~~
~~~

숫자 입력 : ~~
딩동뎅...x번만에 맞추셨습니다.


한번더 n의 경우

"프로그램을 종료합니다."



*/
