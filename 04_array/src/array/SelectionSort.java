package array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {32, 40, 25, 78, 56};
		
		//소트 전
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d",ar[i]));
		}
		System.out.println();
		
		//정렬
		//오름차순(ASCENDING)
		//내림차순(DECENDING)
		int temp;
		for(int i=0; i<ar.length-1; i++) { // 마지막방은 할 필요 없음= -1 (이미 전까지 크기비교를 해서 남은게없음)
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i] > ar[j]) { //  > 오름차순 ,    < 내림차순
					temp = ar[i];
					
					ar[i] = ar[j];
					
					ar[j] = temp;
					
				}
				
			}//for j
		}//for i
		
		//소트 후
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d",ar[i]));
		}
		System.out.println();
	}

}
// 32  40  25  78  56 소트 전 결과
// 25  32  40  56  78  소트 후 결과 (정렬)
