package switch_;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		int days; 
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("월 입력 : ");
		int month = scan.nextInt();
		
		switch(month) {
		case 1 : days=31; break; 
		case 2 : days=28; break;
		case 3 : days=31; break;
		case 4 : days=30; break;
		case 5 : days=31; break;
		case 6 : days=30; break;
		case 7 : days=31; break;
		case 8 : days=31; break;
		case 9 : days=30; break;
		case 10 : days=31; break;
		case 11 : days=30; break;
		case 12 : days=31; break;
		default : days=0; // 1부터 6까지가 아닌 그 외에 수가 들어올 때 0으로 해야 에러가 안난다.
							// 그러나, break 를 안걸면 계속 내려가서 0이 뜸
							// 값이 없을 때는 생략하고 내려가다가 있는 값을 나타냄
							//EX) case 1 :   
							//	  case 2 : 
						   //     case 3 : days=31; break;       <ㅡ
		}
		
		System.out.println(month + "월은 " + days + "일 입니다"); 
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
