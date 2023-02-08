package array;

import java.util.Scanner;

public class Baseball_222 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];
		String yn;
		int strike = 0;
		int ball = 0;
		
		do {              // 반복한다는 것은 y 또는 n이 안들어왔다는 뜻 = y or n을 입력해야 넘어감
			System.out.println("게임을 시작하겠습니까? (Y/N) : ");
			yn= sc.next();
			
		}while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n"));  //  String yn;을 do안에 말고 바깥에다 입력해야 인식됨
			
		if(yn.equals("Y") || yn.equals("y")) {
			System.out.println("게임을 시작합니다");
				
			//컴퓨터가 난수를 발생해야함
//			com[0] = (int)(Math.random()*9+1);
//			com[1] = (int)(Math.random()*9+1);
//			com[2] = (int)(Math.random()*9+1);
			for(int i=0; i<com.length; i++) {
				com[i] = (int)(Math.random()*9+1);
				
				//난수 발생한거에서 중복을 제거해야함
				for(int j=0; j < i ; j++) {
					if(com[i] == com[j]) {
						i--; // 줫다빼기 = 0
					break; //for j 를 벗어나라
				}
				}//for j
			}//for i
			
			System.out.println(com[0] + " , " + com[1] + " ," + com[2]);
		
			//사용자 숫자 입력
			while(true) {
				System.out.println();
				System.out.println("숫자 입력 : ");
				String num = sc.next();
				
				// 나눠서 입력해야 하기때문에 ex) 숫자입력을 469했으면
				user[0] = num.charAt(0)-48; // 0번째 꺼내라 = 4       * -48 = -'0'으로 써도 된다.
				user[1] = num.charAt(1)-48; // 1번째 꺼내라 = 6
				user[2] = num.charAt(2)-48; // 2번째 꺼내라 = 9
				System.out.println(user[0] + " ," + user[1] + " , " + user[2] );
				
			
			
			//비교
				strike = ball = 0;
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<user.length; j++) {
					
					if(com[i] == user[j]) { //값도 똑같고 
						if(i == j) strike++; // 방번호도 똑같으면 strike
						else ball++;
					}
				}//for j
			}//for i
			
			System.out.println(strike + "스트라이크\t" + ball + "볼");
			
			if(strike == 3) {
				System.out.println("정답!");
				break; //while을 벗어나라
			}
			
			}//while
			
			
		}else
			System.out.println("프로그램을 종료합니다");
		
		
			
	}

}
