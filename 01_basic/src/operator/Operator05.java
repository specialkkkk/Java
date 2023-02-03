package operator;

public class Operator05 {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a);
		System.out.println("!a = " + !a); // 현재 조건을 반대로 할때 = !
		System.out.println();
		
		String b = "apple"; // literal 생성
		String c = new String("apple");
		
		String result = b == c ? "같다" : "다르다"; // b와 c의 주소가 같다? 틀림 
		System.out.println("b == c : " + result);
		System.out.println("b == c : " + (b != c ? "참" : "거짓"));
		System.out.println();
		
		
		String result2 = b.equals(c) ? "같다" : "다르다";  // equals = b와 c의 주소를 물어보는 것
		System.out.println("b.equals(c): " + result);
		System.out.println("!b.equals(c): " + (!b.equals(c) ? "참" : "거짓"));
		
		
		
		
	}

}
