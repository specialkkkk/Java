package for_;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shape[] = {"가위",  "바위",  "보자기"};
		
		System.out.print("insert coin : ");
		int insertCoin = scan.nextInt();
		
		for(int i=insertCoin/300; i>0; i--) {
			int com = (int)(Math.random()* 3 + 1);
			System.out.print("가위(1), 바위(2), 보(3) 중 번호 입력 : ");
			int user = scan.nextInt();
			if(user > 3 || user < 1) {
				System.out.println("잘못입력하셨습니다.");
				i++;
				continue;
			}
			System.out.println("컴퓨터 : "+ shape[com-1] + " 나 : "+ shape[user-1]);
			
			for(int j=1;j<4;j++) {
				if(user==j)
					if(com==(j-1==0 ? j=3 : j-1)) {
						System.out.println("You Win!!");
					}else if(com==j) {
						System.out.println("You Draw!!");
					}else {
						System.out.println("You Lose!!");
					}
			}//for(j)
			
			
		}//for(i)
		System.out.println("you need to insert coin");
		
	}

}

/*

[문제] 가위, 바위, 보 게임   if 3게임 , 반복 for 3번..
- 가위(1), 바위(2), 보자기(3) 지정한다.
- 컴퓨터(com)는 1 ~ 3까지 난수로 나온다
- 1게임당 300원으로 한다.

[실행결과]
insert coin : 1000

가위(1), 바위(2), 보(3) 중 번호 입력 : 3 (user, 사용자)
컴퓨터 : 바위   나 : 보자기
You Win!!

가위(1),바위(2),보(3) 중 번호 입력 : 1 (user)
컴퓨터 : 가위   나 : 가위
You Draw!!

가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 가위   나 : 보자기
You Lose!!
*/


