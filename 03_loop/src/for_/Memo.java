package for_;

public class Memo {

	public static void main(String[] args) {
//		가위 -1 바위 -2 보 -3 
		int user = 1;
		int com =  1;
		for(int j=1;j<4;j++) {
			if(user==j)
				if(com==j) {
					System.out.println("You Draw!!");
				}else if(com==(j-1==0 ? j=3 : j-1)) {
					System.out.println("You Win!!");
				}else {
					System.out.println("You Lose!!");
				}
		}//for(j)
	}
}
