package for_;

public class For05 {

	public static void main(String[] args) {
		int count = 0; 
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				int num = (int)(Math.random() * (90-65+1)+65) ;
				System.out.print((char)num+" ");
								
				count++;
		        if (count % 10 == 0) {
		          System.out.println();
		        } // if 추가= 10개씩 끊어서 나옴
		        
			}//for(j)
		}//for(i)  여기까지하면 알파벳 100개가 한줄에 나옴
			   
		      

		

	}

}


/*
[문제] 대문자(A~Z)를 100개 발생하여 출력하시오 //for, if로
- 1줄에 10개씩 출력
- 100개중에서 A가 몇개 나왔는지 개수를 출력

[실행결과]
H  D  D  R  A  Y  A  K  T  H
C  X  F  Z  B  S  L  Y  Q  D
H  K  O  H  O  B  Z  N  J  T
U  P  A  P  K  Q  G  W  F  A
S  U  D  Z  I  V  J  U  O  G
L  M  Z  L  H  U  Y  D  Q  R
F  T  I  Z  A  W  E  O  F  Z
A  Y  C  I  U  Z  O  B  C  G
H  G  Y  Z  V  P  I  R  L  G
Y  H  R  R  M  H  Y  S  B  P

A의 개수 = 6
 */
