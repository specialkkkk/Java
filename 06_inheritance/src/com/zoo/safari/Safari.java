package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo {// protected여도 extends(자식)이면 가능

	public static void main(String[] args) { //패키지가 다르면 퍼블릭만 가능
		Zoo z = new Zoo(); 
		z.tiger(); // 퍼블릭 (가능)
//		z.giraffe(); // protected (가능 , but)
//		z.equals(); // void (에러)
//		z.lion(); // private (에러)
		System.out.println();

		Safari s = new Safari();
		s.tiger();
		s.giraffe(); // protected 는 sub클래스로 생성해야한다
		//				super클래스는 안된다
//		s.elelphant();
//		s.lion();
		

	}

}
