package array;

public class Array05 {

	public static void main(String[] args) {
		char[] ar = new char[50]; //50개의 방을 만듬
		int[] count = new int[26];// 
		
		
		
		
		
		
		for(int i=0; i<ar.length; i++) {
			//ar[i] = (char)(Math.random() * (90-65+1)+65) ; 65가 밖에 있으면 int /65를 안에다가 넣어야 char로 인식 
			ar[i] = (char)(Math.random() * 26+65) ; 
		}for (int i = 0; i < ar.length; i++) {
			if (i % 10 == 0) {
				System.out.println();
			}
			System.out.print(ar[i] + " ");
		
	}
		
		
	
		
		
		
	}
	
}


/*
[문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
- 1줄에 10개씩 출력
- A의 개수? B의 개수? C의 개수? ~~~ Z의 개수 ?

[실행결과]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C

A : 2
B : 3
...
X : 0
Y : 1
Z : 0

	for (int i = 0; i < letters.length; i++) {
		letters[i] = (char)(r.nextInt(26) + 65);
	}
	
	for (int i = 0; i < letters.length; i++) {
		if (i % 10 == 0) {
			System.out.println();
		}
		System.out.print(letters[i] + " ");
	}
}
*/