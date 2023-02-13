package class__;

import java.util.Scanner;

public class StringMain2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			System.out.print("문자열 입력 : ");
			String a = scan.next();
			System.out.print("현재 문자열 입력 : ");
			String now = scan.next();
			System.out.print("바꿀 문자열 입력 : ");
			String change = scan.next();
		
			
			if(a.length() < now.length()) {
				System.out.println("입력한 문자열의 크기가 작습니다");
				System.out.println("치환할 수 없습니다.");
				System.exit(0); // 프로그램 강제 종료
			}
			
			a = a.toLowerCase();
			now = now.toLowerCase();
			
			
			
			
			
			
			
			
//			index = a.indexOf("aa", 0)
//					2		
//					index = original.indexOf("aa", index + "aa".length());
//					4
//					index = original.indexOf("aa", index + "aa".length());
//					9
//					index = original.indexOf("aa", index + "aa".length());
//					-1   =  더이상 값이 없어서 -1나옴
//			// 언제끝날지 모르니 for문 말고 while !
			
			int index = 0;
			int cnt = 0;
			
			while((index = a.indexOf(now, index)) != -1) { 
				cnt++;
				index = index + now.length();
			}//while
			
			System.out.println(a.replace(now, change));
			System.out.println(cnt + "번 치환");
		
		
}
}




 
 
 
/*
치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()   toUpperCase , toLowerCase
대소문자가릴때 =while + if
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다
 
 
*/
