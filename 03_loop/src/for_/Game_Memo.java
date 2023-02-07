package for_;

import java.util.Scanner;

public class Game_Memo {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("insert coin : ");
		int money = sc.nextInt();
		
		for(int i=1; i<=money/300; i++) {
			int com = (int)(Math.random() * 3) + 1; // 컴퓨터 난수 발생
			
			System.out.print("가위(1), 바위(2), 보(3) 중 번호 입력 : ");
			int user = sc.nextInt();
			
			if(com == 1) { //컴이 가위(1)가 나왔을 때
				if(user == 1) {
					System.out.println("컴퓨터 : 가위     나 : 가위");
					System.out.println("you draw!!");
					
				}else if(user == 2) {
					System.out.println("컴퓨터 : 가위     나 : 바위");
					System.out.println("you win!!");
				}else if(user == 3) {
					System.out.println("컴퓨터 : 가위     나 : 보");
					System.out.println("you lose!!");
				}
			}
			else if(com == 2) { //컴이 가위(1)가 나왔을 때
				if(user == 1) {
					System.out.println("컴퓨터 : 바위     나 : 가위");
					System.out.println("you lose!!");
					
				}else if(user == 2) {
					System.out.println("컴퓨터 : 바위     나 : 바위");
					System.out.println("you draw!!");
				}else if(user == 3) {
					System.out.println("컴퓨터 : 바위     나 : 보");
					System.out.println("you win!!");
				}
				else if(com == 3) { //컴이 가위(1)가 나왔을 때
					if(user == 1) {
						System.out.println("컴퓨터 : 보     나 : 가위");
						System.out.println("you win!!");
						
					}else if(user == 2) {
						System.out.println("컴퓨터 : 보     나 : 바위");
						System.out.println("you lose!!");
					}else if(user == 3) {
						System.out.println("컴퓨터 : 보     나 : 보");
						System.out.println("you draw!!");
					} 
		}//for

			     
			      	
	}
  }
}
}

		 
		   
		   
		
		
		