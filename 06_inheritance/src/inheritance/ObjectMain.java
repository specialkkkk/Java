package inheritance;

class Test extends Object {
	
}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
class Sample {
	@Override
	public String toString() {
		return getClass() + "@개바부";
		
	}
}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
class Exam {
	private String name = "홍길동";
	private int age = 25;
	
	@Override
	public String toString() {
		return name + "\t" + age;
		
//		return super.toString(); //super = 부모 클래스의 주소값을 가지고 있음   부모 = extend
	}
}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
public class ObjectMain {
	

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = " + t); //클래스명@16진수  //객체 t = inheritance.Test@6f2b958e
		System.out.println("객체 t = " + t.toString()); 
		System.out.println("객체 t = " + t.hashCode()); 
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("객체 s = " + s.toString());
		System.out.println();
		
		
		Exam e = new Exam();
		System.out.println("객체 e = " + e.toString());
		System.out.println();
		
		String aa = "apple";
		System.out.println("객체 aa = " + aa); //문자열
		System.out.println("객체 aa = " + t.toString()); 
		System.out.println("객체 aa = " + t.hashCode()); 
		System.out.println();
		
		String bb = new String("apple");
		String cc = new String("apple");
		System.out.println("bb==cc : " +  (bb==cc));   //주소 false
		System.out.println("bb.equals(cc) : " + bb.equals(cc)); //문자열 true //스트링일때만 문자열비교
		System.out.println();
		
		
		Object dd = new Object();
		Object ee = new Object();
		System.out.println("dd==ee : " +  (dd==ee));   //주소 false  
		System.out.println("dd.equals(ee) : " + dd.equals(ee)); //문자열 false // 오브젝트는 주소비교
		System.out.println();
		
		
		Object ff = new String("apple");
		Object gg = new String("apple");
		System.out.println("ff==gg : " +  (ff==gg));   //주소 false
		System.out.println("ff.equals(gg) : " + ff.equals(gg)); //문자열 true //스트링일때만 문자열비교
		System.out.println();  // 무조건 자식의 equals가 우선
		
		
	}

}

/*
  class Object {
   public String toString() {}      	클래스명@16진수
   public int hashCode() {}     		10진수
   public boolean equals(Object ob){}   참조값 비교
}

class String
   public String toString() {}     	 	문자열
   public int hashCode() {}     		10진수 (믿으면 안된다) - 표기할 수 있는 문자열은 무한이기 때문에  10진수로 표기 할 수 없다.
   public boolean equals(Object ob){}   문자열 비교
}
*/
