package multi_;

public class MultiFor03 {

	public static void main(String[] args) {
		int dan, i;
		
		for(i=1; i<=9; i++) {
			for(dan=2; dan<=9; dan++) {
				
				System.out.print(dan + "*" + i + "=" + dan*i + "\t");
			} //for dan
			System.out.println();
		} //for i
	}

}
//자주 바뀌는게 dan이니까 이중포문 중에 for(dan)을 안으로 넣어준다

/*
2*1=2	3*1=3  4*1=4.  .    9
2*2=4   3*2=6   .  . .  .   9
2*3=6	. 
2*4=8	.		..	.
2*5=10	.	.	.	.	..
2*6=12	.	.	.	.
2*7=14	.	.	.	.	..
2*8=16	.		.	.	.	.
2*9=18	.	.	.	.	.	.


*/
