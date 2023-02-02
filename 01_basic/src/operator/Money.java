package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		int money;
		
		Scanner scan = new Scanner(System.in); // java.util에 있어 java.lang이 아니라! 그래서 import   // 그래도 에러 -> System.in (입력 - 키보드)
	    System.out.print(" 돈 입력 = ");       // 키보드로부터 입력받는 Scanner 클래스를 생성
		money = scan.nextInt();
		
		int thousand = money / 1000; //5 
		int thousand_mod = money % 1000; //378
		
		int hundred = thousand_mod / 100; //3
		int hundred_mod = thousand_mod % 100; //78
		
		int ten = hundred_mod / 10; //7
		int one = hundred_mod % 10; //8
		
		DecimalFormat abc = new DecimalFormat();
		System.out.println("현금 = " + abc.format(money) + "원"); //3자리마다 쉼표 찍기
		System.out.println("천원 = " + thousand + "장");
		
		
		System.out.println("백원 = " + hundred + "개");
		System.out.println("십원 = " + ten + "개");
		System.out.println("일원 = " + one + "개");
		
	}

}
/*
[문제] 현금 5378원이 있습니다
힌트= 나누기 , %  써야함
[실행결과]
현금 : 5378원
천원 : 5장
백원 : 3개
십원 : 7개
일원 : 8개
*/