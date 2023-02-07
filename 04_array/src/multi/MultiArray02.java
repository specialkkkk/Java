package multi;

public class MultiArray02 {

	public static void main(String[] args) {
		int[][] ar = new int[10][10];  //빈방 10x10  100개
		int num=0; //num 1씩증가
		
		//입력
//		ar[0][0]=1;
//		ar[0][1]=2;
//		~~
//		ar[0][9]=10;
//		
//		ar[1][0]=11;
//		~~~
		
		
		/* 가로로 1 2 3 4 5 6 7 ~ 10
	
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length; j++) {
				num++;
				ar[i][j] = num;
			}//for j
		}//for i
		
		
		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		*/
		
		
		
		
		
		/*ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		
		//세로로  1 11 21 31 41 51 ~ 91
		//      2  12 22 32 42 52 ~ 92
		ar[0][0]=1;   ar[0][1]=11;
		ar[1][0]=2;	  ar[1][1]=12;
		ar[2][0]=3;	  ar[2][1]=13;
		
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length; j++) {
				num++;
				ar[j][i] = num;  // 여기만 i,j 순서를 바꾸면 세로로 출력됨
			}//for j
		}//for i
		
		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		*/
		
		
		
//		ar[9][9]=1; ar[8][9]=11;
//		ar[9][8]=2; ar[8][8]=12;
//		ar[9][7]=3; ar[8][7]=13;
		
		for(int i=ar.length-1; i>=0; i--) {
			for(int j=ar[i].length-1; j>=0; j--) {
				num++; // 1 2 3 4 5
				ar[i][j] = num;  // 
			}//for j
		}//for i
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//출력
		for(int i=0; i<ar.length; i++) {     //i<3 = i<ar.length  =행 알아서 계산
			for(int j=0; j<ar.length; j++) { //length = 열 알아서 계산
				//System.out.println("ar["+i+"]["+j+"] = " + ar[i][j]); // i,j가 알파벳으로 보이기때문에 나눠줌
				System.out.print(String.format("%4d", ar[i][j])); //ln없애고 스트링포맷으로 자리수 맞추기
			}//for j
			System.out.println(); // 숫자 띄우기 위해 씀
		}//for i

	}

}
