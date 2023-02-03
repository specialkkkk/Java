package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하시오 :  "); // println하면 밑줄에 써지고 print하면 옆에다 써짐
		String name = scan.nextLine();            //   print★ln★("직급을 입력하시오:");
		                                         //ex) 직급을 입력하시오 :  
												//     대리
		

		System.out.print("직급을 입력하시오 :  ");
		String jik = scan.nextLine();
		
		System.out.print("기본급을 입력하시오 :  ");
		double ki = scan.nextDouble();
		
		System.out.print("수당을 입력하시오 :  ");
		double su = scan.nextDouble();
		double tot = ki + su;
		
		
		System.out.print(tot);
		
		double taxrate = tot >= 5000000 ? 0.03 : tot >= 3000000 ? 0.02 : 0.01 ;
		System.out.print(taxrate);
		
		double tax = taxrate * tot;
		
	
		double wol = tot - tax;
		
		
		
		DecimalFormat abc = new DecimalFormat();
		System.out.println("***" + name + " " + jik + "월급 ***");
		System.out.println("기본급 :" + abc.format(ki) + "원");
		System.out.println("수당 :" + abc.format(su) + "원");
		System.out.println("합계 :" + abc.format(tot) + "원");
		System.out.println("세금 :" + abc.format(tax) + "원");
		System.out.println("월급 :" + abc.format(wol) + "원");
		
	}

}

/*
 [문제] 월급 계산 프로그램 - 조건 연산자
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
단 합계가 5,000,000원 이상이면 3%
       3,000,000원 이상이면 2%
       아니면 1%
       
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원
 */



/*
String name, position;
int baspay, extrapay, total, tax, salary;
double taxRate;


sysout 이름 직급 기본급 수당

total = basePay + extrapay;
taxRate = total>=5000000 ? 0.03 : total>=3000000 ? 0.02 : 0.01;
tax = total * taxRate; // 실수와 정수형으로 하면 계산x 
=> tax = (int)total * taxRate; // (int) = 정수형으로 바꾸어라
salary = total - tax;



 */
 