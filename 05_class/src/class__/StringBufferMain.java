package class__;

import java.util.Scanner;

public class StringBufferMain {
	private int dan;
	
	
	public void input() {  // 지역   = 지역으로 만들어서 쓰고 버리자 = 메모리 아끼기
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단을 입력 : ");
		dan = scan.nextInt();
	}
	
	
	public void output() {
		StringBuffer buffer = new StringBuffer(); //append(), delete()
		
		for(int i=1; i<=9; i++) { 
			System.out.println(dan + " * " + i + " = " + dan * i);
		
			buffer.append(dan);//5
			buffer.append("*");//*
			buffer.append("i");//5
			buffer.append("=");//=
			buffer.append("dan*i");//5*5

				System.out.println(buffer.toString()); 
				
				buffer.delete(0, buffer.length()); // for문 돌아가고 다시 반복할때 전에 했던것 지움
				
				
			    //ex) 구구단5단 = buffer => "5*1=5"
				//						   01234
				//ex) 구구단5단 = buffer => "5*2=10"
				//						   012345
				// buffer.delete(0,5); =>  0부터 5번째 전까지 지움
				
				//=>(0, buffer.length())   => 0부터  길이에 맞춰서 지움
				
				
		}//for
		
	}
	
	
	
	public static void main(String[] args) { // 전역
		StringBufferMain sbm = new StringBufferMain();
		sbm.input();
		sbm.output();
		
		
		
		
		

	}

}

/*
[문제] 구구단
								
원하는 단을 입력 : 5                    input()
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
									output()
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45

 */

