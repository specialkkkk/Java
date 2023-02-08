package array;

public class Array05_02 {

	public static void main(String[] args) {
		char[] ar = new char[50]; //50개의 방을 만듬
		int[] count = new int[26];// A~Z까지 카운트
		
		
				
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = (char)(Math.random() * 26+65) ; 
			
			//각 문자의 개수 구하기
			for(int j=0; j<count.length; j++) {
				if(ar[i] == 65+j) count[j]++; // 65=A   65+25 =Z  / 65+j 
			}//for j
			
		}//for i
			
		
		
		
		
		
		
		//출력
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+ " ");  //print ln하면 세로로  print 하면 가로로
			if((i+1)%10 == 0) System.out.println();
			 
		}
		
//		i  count (i+1)  count를 쓰지말고 i+1로 하면 더 간단
//		0    1
//		1	 2
//		2    3
//		3    4
	
		
		
	// 알파벳 개수 출력
		for(int i=0; i<count.length; i++) {
			System.out.print((char)(i+65) + " : " + count[i] + "\t"); // print 가로로
			if((i+1)%5 == 0) System.out.println(); //5개씩 끊기
		}
			

	}

}
