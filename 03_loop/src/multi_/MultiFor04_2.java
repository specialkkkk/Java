package multi_;

public class MultiFor04_2 {

	public static void main(String[] args) {
		
		int dan, i ;// 
		
		for(int w=2; w<=8; w+=3) { // 3번  w=1  w=2  w=3 또는 w=2 w=5 w=8
				
		for(i=1; i<=9; i++) {
			for(dan=w; dan<=w+2; dan++) {
//				2           4
//				5			7
//				8           10
//				k          k+2  규칙성
				
				if(dan != 10) System.out.print(dan + "*" + i + "=" + dan*i + "\t");
			} //for dan
			System.out.println();
		} //for i
		System.out.println();
		}//for w

		
		
		
		
		
	}

}
