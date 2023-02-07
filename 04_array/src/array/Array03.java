package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		int size;
		int[] ar;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("배열 크기  : ");
		size = scan.nextInt();
		
		ar = new int[size]; // 배열 생성
		
//		System.out.println("ar[0] 입력 : ");     <  for 1  >
//		ar[0] = scan.nextInt();
//		System.out.println("ar[1] 입력 : ");
//		ar[1] = scan.nextInt();
//		System.out.println("ar[2] 입력 : ");
//		ar[2] = scan.nextInt();
//		System.out.println("ar[3] 입력 : ");
//		ar[3] = scan.nextInt();
		
		for(int i=0; i<size; i++) {
			System.out.println("ar[i] 입력 : ");
			ar[i] = scan.nextInt();
			
			sum += ar[i];
		} 
		System.out.println();
		
		//최대값
		// = 배열의 첫번째 데이터를 초기값으로 갖는다.
		int max = ar[0];// max는 ar의 0번째 방을 가져라
		for(int i=1; i<ar.length; i++) {
			if(ar[i] > max) max = ar[i];
		}
//		if(ar[1] > max) max = ar[1]; 최대값 for문 만들기 전
//		if(ar[2] > max) max = ar[2];
		
		
		//최소값
		int min = ar[0]; // min은 ar의 0번째 방을 가져라
		for(int i=1; i<ar.length; i++) {
			if(ar[i] < min) min = ar[i];
		}
		
		
//		System.out.println(ar[0] + "  ");       <  for 2  >
//		System.out.println(ar[1] + "  ");
//		System.out.println(ar[2] + "  ");
//		System.out.println(ar[3] + "  ");
		
		for(int data : ar) {
			System.out.print(data + " ");
		}
		System.out.println();
		System.out.println("합 = "+ sum);
		System.out.println("최대값 = "+ max);
		System.out.println("최소값 = "+ min);
		
			
		}

	}



/*
[문제] 배열의 크기를 입력받아서 배열을 생성.

[실행결과]
배열 크기 입력 : 3

ar[0] 입력 : 25
ar[1] 입력 : 13
ar[2] 입력 : 57

25 13 57
합 = xxx
*/