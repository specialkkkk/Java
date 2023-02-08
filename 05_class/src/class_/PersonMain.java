package class_;

class Person{ //프라이빗 = 감춤 // 싸이 일촌
	private String name; //필드, 초기값 null
	private int age;     //    초기값 0
	
	public void setName (String n){//구현  메소드 (일촌신청) //  결과형 메소드명(인수형 인수) void = 나가는게 없다
		                 // name 앞글자 따서 n   ,   name이 문자열이기 때문에 String
		name = n;
}

	public void setAge (int a){ //구현  age 앞글자 따서 a
		age = a;
	}  
	
	
	public void setData(String n, int a) { //  구역단위라 setName의 n과 setAge의 a와 겹치지 않음
		name = n;
		age = a;
	}
	
	public void setData() {}  // 똑같은 이름의 메소드를 Overload = Overloading (쌍둥이)
	
	
	
	public String getName() {  // set은 구현이고 get은 반환
		return name; //반환값
	}
	
	public int getAge() { // 반환
		return age;  // 반환값
		
	}
	
	
	
} 
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
public class PersonMain { // Person.class 파일과  PersonMain.class 파일    2개가 생긴다

	public static void main(String[] args) {//필드 
		
		Person a; // 객체 선언  //  클래스형 변수
		a = new Person();// 생성    주소 new Person => a
		
		System.out.println("객체 a = " + a);   //객체 a = class_.Person@6f2b958e
		a.setName("홍길동"); //호출  = 호출한 함수는 반드시 제자리로 돌아온다. = 수행시간이 길어짐
		a.setAge(25); //호출   
		
		System.out.println("이름=" + a.getName() + "\t 나이 = " + a.getAge());
		
		
		
		Person b = new Person();
		System.out.println("객체 b = " + b);   //객체 b = class_.Person@5e91993f
		b.setName("코난");
		b.setAge(13);
		
		System.out.println("이름=" + b.getName() + "\t 나이 = " + b.getAge());
		

		
		Person c = new Person();
		System.out.println("객체 c = " + c);
		c.setData("둘리", 100);
		System.out.println("이름=" + c.getName() + "\t 나이 = " + c.getAge());
		
		
		Person d = new Person();
		System.out.println("객체 c = " + d);
		d.setData("둘리", 100);
		System.out.println("이름=" + d.getName() + "\t 나이 = " + d.getAge());
		
		
	}

}
