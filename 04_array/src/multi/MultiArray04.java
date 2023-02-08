package multi;

public class MultiArray04 {

	public static void main(String[] args) {
		int[][] ar = new int[3][]; //다차원배열  //가변길이(행열이 정해진게아니라 변할수있는)
		ar[0] = new int[2];   //0행에는 방을 몇개? = 2개
		ar[1] = new int[3];   //1행에는 방을 몇개? = 3개
		ar[2] = new int[4];   //2행에는 방을 몇개? = 4개
		
		ar[0][0] = 10;
		ar[0][1] = 20;
		
		ar[1][0] = 30;
		ar[1][1] = 40;
		ar[1][2] = 50;
		
		ar[2][0] = 60;
		ar[2][1] = 70;
		ar[2][2] = 80;
		ar[2][3] = 90;
		
		System.out.println("배열명 ar = " + ar);  //배열명 ar = [[I@3d012ddd
		for(int i=0; i<ar.length; i++) { //방 개수가 달라도 ar이 주소를 가지고 있으므로 상관 x
			
			System.out.println("행 ar["+i+"] = " + ar[i]); //행  ar[0] = [I@626b2d4a ~ ar[1] . .ar[2]. . . . .
			for(int j=0; j<ar[i].length; j++) {
				System.out.println("ar["+i+"]["+j+"] = " +ar[i][j]);
							}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
