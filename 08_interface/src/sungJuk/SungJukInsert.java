package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk{

	public void execute(ArrayList<SungJukDTO>arrayList) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("번호 입력 : ");
		int no = scan.nextInt();
		System.out.println("이름 입력 : ");
		String name = scan.next();
		System.out.println("국어 입력 : ");
		int kor = scan.nextInt();
		System.out.println("영어 입력 : ");
		int eng = scan.nextInt();
		System.out.println("수학 입력 : ");
		int math = scan.nextInt();
		
		
		SungJukDTO sungJukDTO = new SungJukDTO(no, name, kor, eng, math);
		sungJukDTO.calc();
		
		arrayList.add(sungJukDTO); //크기가 가변적인 배열을 구현한 클래스
		
		System.out.println("입력하였습니다");
		
	}
}
