package basic;

import java.util.Arrays;
import java.util.Random;

public class MethodTest02 {

	public static void main(String[] args) {
		//난수 = 컴퓨터가 불규칙적으로 발생하는 수
		//    = 0 <= 난수 < 1     * 난수 = 0.어쩌구
		
		double a = Math.random();
		System.out.println("난수 = " + a); //static이 있다 //결과: 0.0759532522456724
		
		Random r = new Random(); //static이 없으면 new 생성해야한다.
		//자바의 디폴트 패키지 = java.lang   -> Random이 java.lang 안에 없으니 에러가 뜸 -> import 해야함 
		double b = r.nextDouble();
		System.out.println("난수 = " + b);
		
		int[] ar = new int[5]; //배열  ,정수형 변수
		ar[0] = 25;
		ar[1] = 13;
		ar[2] = 45;
		ar[3] = 30;
		ar[4] = 15;
		System.out.println(ar[0]+", " + ar[1] + ", " + ar[2] + ", " + ar[3] + ", " + ar[4] );
		
		
		Arrays.sort(ar);  //정렬 = 오름차순  static void = 값이 없다 = 입력X
		System.out.println(ar[0]+", " + ar[1] + ", " + ar[2] + ", " + ar[3] + ", " + ar[4] );
	}

}
