package com.zoo;

public class Zoo2 {

	 public static void main(String[] args) {
		 Zoo z = new Zoo(); 
			z.tiger(); // 퍼블릭 (가능)
			z.giraffe(); // protected ( 같은 패키지라 가능)
			z.equals(); // void (같은 패키지라 가능)
			z.lion(); // private (에러)
	 }
}
