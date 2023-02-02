package operator;

public class Operator04 {

	public static void main(String[] args) {
		int num1=0, num2=0;
		boolean result;
		
		result = ( (num1+10) < 0  && (num2+=10) > 0 );
		System.out.println("result = " +result);
		System.out.println("num1 = "+ num1 + "num2 = " + num2);
		System.out.println();
// &&  앞의 조건이 False라( 10 < 0 ) 뒤에 조건은 실행하지 않음
		
		result = ( (num1+10) > 0 || (num2+=10) >0 );
		System.out.println("result = " +result);
		System.out.println("num1 = "+ num1 + " num2 = " + num2);
	
		// or 앞의 조건이 맞다면 뒤에 조건은 실행하지 않음
	}

}
