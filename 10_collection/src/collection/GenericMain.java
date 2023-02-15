package collection;

class GenericTest<T>{
	private T a;

	public void setA(T a) { //리턴값 없으니 void
		this.a = a;
	}
	
	public T getA() {
		return a;
	}

	
	
	
	
}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
public class GenericMain {

	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>();
		aa.setA("홍길동");
		System.out.println("이름 = " + aa.getA());
		
//		aa.setA(25); String으로 정의했기 때문에 작동하지 않음
		
		GenericTest<Integer> bb = new GenericTest<Integer>();
		bb.setA(25);
		System.out.println("나이 = " + bb.getA());
		
		GenericTest cc = new GenericTest();

	}

}
