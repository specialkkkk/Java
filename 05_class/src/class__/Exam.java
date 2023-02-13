package class__;

import java.util.Scanner;

public class Exam {
	private String name;
	private String dap;
	private char[] ox = null; // ox라는 방 ([] = 배열)을 만들어놓음 //아직 null
	private int score;
	private final String JUNG = "11111"; //상수화  JUNG=정답
	
	public Exam(){  //  생성자(){~~   생성자는 클래스의 이름과 똑같다
		Scanner sc = new Scanner(System.in);
		System.out.println("이름입력 : ");
		this.name = sc.next();   //this=  private String name;
		System.out.println("답입력 : ");
		this.dap = sc.next(); // this = private String dap;
		
		ox = new char[5]; //ox = null이니까 생성해줌
		
	}
	
	 public void compare() {
	      for(int i= 0; i<ox.length; i++) {
	      //for(int i= 0; i<JUNG.length(); i++) {
	         if(dap.charAt(i) == JUNG.charAt(i)) {
	               ox[i] = 'O';
	               score += 20;
	         }else
	            ox[i] = 'X';
	      }
	   }
	
	
	public String getName() {
		return name;
		
	}
	public char[] getOx() {
		return ox;
	}
	public int getScore() {
		return score;
	}
}
	
