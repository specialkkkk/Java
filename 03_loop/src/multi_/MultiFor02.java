package multi_;

public class MultiFor02 {

	public static void main(String[] args) {
		int dan, i;
		for(dan=1; dan<=9; dan++) {
			for(i=1; i<=9; i++) {
				
				System.out.println(dan + "*" + i + "=" + dan*i);
			} //for i
			System.out.println();
		} //for dan
		

	}

}
/*
[문제] 2단 ~9단 
2*1=2
2*2=4
2*3=6
2*4=8
2*5=10
2*6=12
2*7=14
2*8=16
2*9=18

3*1=3
3*2=6
3*3=9
3*4=12
3*5=15
.
.
.
.

*/
