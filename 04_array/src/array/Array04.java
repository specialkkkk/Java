package array;

import java.util.Scanner;

public class Array04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		boolean[] ar = new boolean[5]; //주차가 되어있냐 아니냐 (참,거짓) = boolean형 배열(ar)을 만든다.
		
		while(true) {
		System.out.println("주차장 관리 프로그램 ");
		System.out.println("*************** ");
		System.out.println("1. 입차 ");
		System.out.println("2. 출차 ");
		System.out.println("3. 리스트 ");
		System.out.println("4. 종료 ");
		System.out.println("*************** ");
		System.out.print("번호 입력 :  ");
		num = scan.nextInt();
		
		if(num == 4) break; // while문 브레이크 먼저

		if(num == 1) {
			System.out.println("위치 입력 : ");
			int position = scan.nextInt();
			
			if(ar[position-1]) 
				System.out.println("이미 주차되어있습니다");
			else {
				ar[position-1] = true;
				System.out.println(position + "위치에 입차");
			}
			
		}else if(num == 2) {
			System.out.println("위치 입력 : ");
			int position = scan.nextInt();
			
			if (ar[position-1]) {
				ar[position-1] = false;
				System.out.println(position + "위치에 입차");
			} else {
				System.out.println("주차되어 있지않습니다");
			}
				
		
		
		
		
			
		}else if(num == 3) {
			for(int i=0; i<ar.length; i++) {
				System.out.println((i+1) + "위치 : " + ar[i]); //0부터 시작이기때문에 사람이 볼때는 1부터 시작으로 보여야해서 i+1
			}//for
			
			
		}
		}//while
		System.out.println("프로그램을 종료합니다.");
	
	
	}
	
}

/*
[문제] 주차관리 프로그램 // 처음에 차가 없기때문에 전부 false


[실행결과] // 무한루프를 돌다가 4번이 나오며 끝나야 한다. while
주차장 관리 프로그램
**************
   1. 입차
   2. 출차
   3. 리스트
   4. 종료
**************
  메뉴 : 
  
1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false  

 */
