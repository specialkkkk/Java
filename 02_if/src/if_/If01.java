package if_;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //import util
		
		System.out.println("숫자 입력 : ");
		int a = scan.nextInt();
		
		if(a >= 50) System.out.println(a + "는 50보다 크거나 같다");
		System.out.println(a + "는 50보다 작다");
		System.out.println();   // 결과창에서 띄우려고, 엔터
		
		if(false)
			if(true) System.out.println("A");
		else System.out.println("B");
		System.out.println("c");
		System.out.println();   //결과 = C
		
		
		if(true)
			if(true) System.out.println("A");
		else System.out.println("B");
		System.out.println("c");
		System.out.println();  // 결과 A -> C
		
		if(true)
			if(false) System.out.println("A");
			else System.out.println("B");
		System.out.println("c");
		System.out.println(); // 결과 B -> C
		
				
		if(a>='A' && a<='Z') // 65 ~ 90
			System.out.println((char)a + "는 대문자");
		else if(a>='a' && a<='z') // 97~ 122
			System.out.println((char)a + "는 소문자");		
		else
			System.out.println((char)a + "는 숫자이거나 특수문자");
		
		
		

	}

}
