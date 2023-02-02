package operator;

import java.util.Scanner;

public class Comp {

	public static void main(String[] args) {
	
		//char ch = 'B';
		char ch = 'e';
		
		//ch가 대문자입니까? 소문자변환 : 대문자 변환 ;
		//ch>=65 && ch<=90? 소문자변환 : 대문자 변환;
		int result = ch>='A' && ch<='Z' ? ch+32 : ch-32;
		//char로 하면 안들어감 int로
		System.out.println(ch + " -> " + (char)result);
		
	
	
	}

}

/*
[문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오
//32차이
[실행결과]
B → b 
또는 

e → E
*/