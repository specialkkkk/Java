package inheritance;

enum Color {
	RED, GREEN, BLUE   // 지정 안해도 기본적으로  0,1,2 순서
	
}

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
class Final{
	public final String FRUIT = "사과";  // 초기값을 사과로 부여
	public final String FRUIT2;
	
	public static final String ANIMAL = "기린"; // 시음식 = 실행하자마자 메모리 자동으로 생성 ( new X)
	public static final String ANIMAL2; // static은 생성자에서 초기화 안된다
	
//	public static final int RED = 0;
//	public static final int GREEN = 1;
//	public static final int BLUE = 2;
	
	
	static { // 초기화 구역
		System.out.println("static 초기화 영역");
		ANIMAL2 = "코끼리";
	}
	
	public Final() {   // 빈칸에 ctrl+space => 생성자 만들기
		System.out.println("기본 생성자");
		FRUIT2 = "딸기";
	}
	
}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
public class FinalMain {

	public static void main(String[] args) {
		final int A = 10; //상수화
//		a = 20;        ﻿에러 = >  final 은 값을 변경할 수 없다.
		System.out.println("A = " + A);
		
		final int B;
		B = 30;     // 자바는 final해도 초기값을 줄 기회를 준다
//		B = 40;   에러
		System.out.println("B = " + B);
	
		
		Final f = new Final(); // 메뉴판 생성     () 물귀신
		System.out.println("FRUIT = " + f.FRUIT);  // 클래스에서 초기값 "사과"부여한 것을 가져옴
		
		
		System.out.println("FRUIT2 = " + f.FRUIT2);
		
		System.out.println("ANIMAL = " + Final.ANIMAL);
		System.out.println("ANIMAL2 = " + Final.ANIMAL2);
		System.out.println();
		
		System.out.println("빨강 = " + Color.RED);
		System.out.println("빨강 = " + Color.RED.ordinal());   //ordinal = 번호부여
		
		for(Color data :Color.values()) {
			System.out.println(data + "\t" + data.ordinal()); //ordinal = 번호부여
		}
		
		
		
	}
	

}
