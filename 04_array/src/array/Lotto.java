package array;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
				
		Scanner scan = new Scanner(System.in);
		
		System.out.print("현금 입력 : ");
		int money = scan.nextInt(); // money 임의로
					
		for(int k=1; k<=money/1000; k++) { // 천원 넣었을때 머니를 천원으로 나눠서 횟수지정
		//난수 발생, 중복X
			for(int i=0; i<6; i++) { //i,6 =  i<ar.length;;
				lotto[i] = (int)(Math.random() * 45 + 1);
				
				//중복체크
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}//for j
			}//for i
		
		
			
	
		//오름차순
			int temp;
			for(int i=0; i<lotto.length-1; i++) {
				for(int j=i+1; j<lotto.length; j++) {
					if(lotto[i] > lotto[j]) { // 오름차순 >  , 내림차순 <
						temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}//if
				}//for j
			}//for i
		
		//출력  lotto 배열의 크기 만큼 for 문을 반복
		for(int data : lotto) { // data임의로 만듬 
			System.out.print(String.format("%5d", data)); // 숫자 한개짜리와 두개짜리가 있어서 간격맞추기
			
						
		}//출력
		System.out.println();// ln해서 로또 1줄마다 엔터
		
		if(k%5 == 0) System.out.println(); // k를 5로 나눴을때 나머지 ==  0 // = 5번째 마다 줄바꿈 
		}// for k    1줄짜리 7번반복
		
		
		
		
		

	}

}

/*
[문제] 로또 - 자동
- 크기가 6개인 배열 생성
- 1 ~ 45 사이의 난수 발생
- 숫자는 오름차순하여 출력 (Selection Sort)
- 출력시 자리수는 5자리로 고정
- 중복 숫자가 나오면 안된다
- 1000원당 1줄이 나온다

[실행결과]
현금 입력 :  7000
  2    4   19   39   43   44
  22   26   33   38   39   42
  5    6    8   25   35   45
  3   14   23   30   34   35
  18   20   25   27   32   37
   
   
  1   16   32   34   41   42
  5    6   18   30   33   44
*/