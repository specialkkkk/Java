package multi;

public class MultiArray01 { //2차원배열(다차원배열)

	public static void main(String[] args) {
		int[][] ar = new int[3][2];  // 3행 2열
		
		ar[0][0]=10;
		ar[0][1]=20;
		
		ar[1][0]=30;
		ar[1][1]=40;
		
		ar[2][0]=50;
		ar[2][1]=60;
		
		for(int i=0; i<ar.length; i++) {     //i<3 = i<ar.length
			for(int j=0; j<ar.length; j++) {
				System.out.println("ar["+i+"]["+j+"] = " + ar[i][j]); // i,j가 알파벳으로 보이기때문에 나눠줌
			
			}//for j
			System.out.println(); // 2개씩 띄우기 위해 씀
		}//for i
		
		
	}

}
