package abstract_;

import java.util.Scanner;

class Shape {
	protected double area;
	protected Scanner scan = new Scanner(System.in);
			
		public Shape() {
		System.out.println("ShapeTest 기본생성자");
			}
			
		public void calcArea() { //추상메소드
		System.out.println("도형을 계산합니다");
									}
		public void dispArea() { //추상메소드
		System.out.println("도형을 출력합니다");
			}
			
			
			
			
			
			
}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

//		삼각형
class Sam extends Shape{   //Sam = 삼각형 임의
	protected int base, height;
	
	public Sam() {
		System.out.println("Sam 기본 생성자");
		System.out.println("밑변 : ");
		base = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();

	}
	
	@Override //어노테이션 
	public void calcArea() {
		area = base * height / 2.0;
	}
	public void dispArea() {
		System.out.println("삼각형 넓이 = " + area);
	}
	
	
	
	
	
	
	
}
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


//       <사각형>


class Sa extends Shape{   //Sa = 사각형 임의
	protected int height, width;
	
	public Sa() {
		System.out.println("Sa 기본 생성자");
		System.out.println("밑변 : ");
		width = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();

	}
	
	@Override //어노테이션 
	public void calcArea() {
		area = width * height ;
	}
	public void dispArea() {
		System.out.println("사각형 넓이 = " + area);
	}
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	
	
	//  <사다리꼴>
	
	class Sadari extends Shape{   //Sadari = 사다리꼴 임의
		protected int height, top , bottom;
		
		public Sadari() {
			System.out.println("Sadari 기본 생성자");
			System.out.println("밑변 : ");
			bottom = scan.nextInt();
			System.out.print("높이 : ");
			height = scan.nextInt();
			System.out.print("윗변 : ");
			top = scan.nextInt();
			

		}
		
		@Override //어노테이션 
		public void calcArea() {
			area = ((top + bottom) * (height)) / 2 ;
		}
		public void dispArea() {
			System.out.println("사다리꼴 넓이 = " + area);
		}
	}
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		
public class ShapeMain {

	public static void main(String[] args) {
		/*
		Sam sam = new Sam();   // Sam 클래스  sam 객체
		sam.calcArea();
		sam.dispArea();
		System.out.println();
		
		Sa sa = new Sa();
		sa.calcArea();
		sa.dispArea();
		System.out.println();
		
		
		Sadari sadari = new Sadari();
		sadari.calcArea();
		sadari.dispArea();
		System.out.println();
		*/
		
		//다형성 => 부모 = 자식 // 모든 부모 클래스는 자식 클래스를 참조할 수 있다 = 상속 쓰는 이유
		Shape shape;  // = 리모콘
		shape = new Sam();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new Sa();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		shape = new Sadari();
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		
		
		
	}
}

	


