package basic;

public class MethodTest {

	public static void main(String[] args) {
		//25 ,36의 큰값을 구하시오
		int big = Math.max(25, 36);  // 함수의 호출
		System.out.println("최대값 = " + big);
	
		//25.8, 78.6의 작은값을 구하시오
		double small = Math.min(25.8, 78.6);  // 함수의 호출 (Math에서 min)
		System.out.println("최소값 = " + small);
	
		//250을 2진수 출력하시오
		
		String binary = Integer.toBinaryString(250); //Integer에서 toBi~ 호출해라
		System.out.println("2진수 = " + binary);
		
		String oct = Integer.toOctalString(250);
		System.out.println("8진수 = " + oct);
		
		String hexa = Integer.toHexString(250);
		System.out.println("16진수 = " + hexa);
		
	}

}
