package multi;

import java.util.Scanner;

public class MultiArray05_1in {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("인원수: ");
		int cnt = scan.nextInt();
		
		String[] name = new String[cnt];
		
		int subjectCnt;
		String subject[][] = new String[cnt][];
		int jumsu[][] = new int[cnt][];
		double[] avg = new double[cnt];
		
		
		System.out.println("이름 입력: ");
		name[0] = scan.next();
		
		System.out.println("과목수 입력:");
		subjectCnt = scan.nextInt();
		
		subject[0] = new String[subjectCnt];   //0행에 2개를 만들어야 하는데 2개들어가는 자리가 바뀔수있으니 subjectCnt로
		System.out.println("과목명 입력:");
		subject[0][0] = scan.next();
		subject[0][1] = scan.next();
		
		jumsu[0] = new int[subjectCnt+1]; // +1은 총점 넣기위해서
		System.out.println(subject[0][0] + " 점수 입력 :");
		jumsu[0][0] = scan.nextInt();
		System.out.println(subject[0][1] + " 점수 입력 :");
		jumsu[0][1] = scan.nextInt();
		
		
		//총점
//		jumsu[0][2] +=    // 0행에 방을 2개 => 방이 2개 이상 바뀔수도 있으니 subjectCnt로 바꿈
		jumsu[0][subjectCnt] += jumsu[0][0];
//								jumsu[0][1];
		
		//평균
		avg[0] = (double)jumsu[0][subjectCnt] / subjectCnt;
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 1인분ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//		name[1]
//				subject [1][0]
//						[1][1]
//			      jumsu [1][0]
//			    		[1][1]
//		 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 바꿔주면 2인분ㅡㅡㅡㅡㅡㅡㅡㅡ
		
	}

}
