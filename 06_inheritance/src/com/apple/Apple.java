package com.apple;

import com.zoo.Zoo; //다른파일이므로 import

public class Apple {

	public static void main(String[] args) {
		System.out.println("빨간 사과");
		
		//Zoo클래스의 tiger() 호출
		Zoo z = new Zoo(); 
		z.tiger(); // 퍼블릭 (가능)
//		z.giraffe(); // protected (에러)
//		z.equals(); // void (에러)
//		z.lion(); // private (에러)
	}

}
