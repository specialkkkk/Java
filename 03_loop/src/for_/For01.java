package for_;

public class For01 {

	public static void main(String[] args) {
		int i;
		for(i=1; i<=10; i++) {
			
			System.err.println("Hello java!!!! : " + i);
	
	}//for
		
	System.out.println("탈출 i = " + i);
	System.out.println();
	
	
	//10 9 8 7 6 5 4 3 2 1
	for(i=10; i>=1; i-- ) {
		System.out.print(i + "  "); // 옆에다가 i (숫자카운트) 적기위해 println =>  print
	
	}//for
	System.out.println();
	
	
	//A B C D E F G ~ ~ ~  X Y Z
	for(i='A'; i<='Z'; i++ ) { //i = int형 이기 때문에 A결과값이 65로 나온다 A 기본값이 65 /Z는 90
		System.out.print((char)i + "  ");     // <= int형을 char로 써야함 (알파벳으로 나타내기 위해) 
	
	}//for
	System.out.println();

	
	
	}
}
