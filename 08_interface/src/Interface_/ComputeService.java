package Interface_;

import java.util.Scanner;

public class ComputeService {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		Compute com = null; //리모콘
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("  *********************");
			System.out.println("	1.	합");
			System.out.println("	2.	차");
			System.out.println("	3.	곱");
			System.out.println("	4.	몫");
			System.out.println("	5.	끝내기");
			System.out.println("  *********************");
			System.out.println("   번호 : ");
			num = sc.nextInt();
					
			if(num == 5) break;
			
			if(num == 1)	com = new Sum(); //부모 = 자식
			else if(num == 2)com = new Sub();
			else if(num == 3)com = new Mul();
			else if(num == 4)com = new Div();
			
			com.disp();
		}//while
		

	}//menu()

}