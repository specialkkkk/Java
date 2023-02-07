package array;

public class Array01 {

	public static void main(String[] args) {
		int[] ar; // int = integer
		ar = new int[5];
		System.out.println("배열명 ar = " + ar); // 배열명 ar = [I@3d012ddd  // ar은 주소를 가지고 있다

		ar[0] = 25;
		ar[1] = 37;
		ar[2] = 55;
		ar[3] = 42;
		ar[4] = 30;
		
		
		System.out.println("배열 크기 = " + ar.length); //5개
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar["+i+"] = " + ar[i]);
			
		}
		System.out.println();
		
		System.out.println("거꾸로 출력");
		for(int i=ar.length-1; i>=0; i--) { //5번방이 없으니 -1을 해줘야한다 // i=4 , i>=0 ; i-- 랑 같은말
			System.out.println("ar["+i+"] = " + ar[i]);
		}
		
		
		System.out.println();
		
		
		System.out.println("홀수 데이터만 출력");
		for(int i=0; i<ar.length; i++) { // 방 전체에서
			if(ar[i]%2 == 1) System.out.println("ar["+i+"] = " + ar[i]); //2로 나눠서 나머지가 1이면 홀수이다
		}
		System.out.println();
		
		System.out.println("확장 for");
		for(int data : ar) { //ar의 크기만큼 for문을 반복한다. ar이 int였으니 int로 씀
			System.out.println(data);
			
		}
	    

		
		
	}
}


//System.out.println("ar[0] = " + ar[0]);
//System.out.println("ar[1] = " + ar[1]);
//System.out.println("ar[2] = " + ar[2]);
//System.out.println("ar[3] = " + ar[3]);
//System.out.println("ar[4] = " + ar[4]);
// 이것을 for문으로 바꿔준것이다
