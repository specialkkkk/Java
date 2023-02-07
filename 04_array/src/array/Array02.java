package array;

public class Array02 {

	public static void main(String[] args) {
		String[] ar = {"호랑이", "사자", "코끼리", "기린", "하이에나", "긴팔원숭이", "고릴라"};

		for(int i=0; i<ar.length; i++) {
			System.out.println("ar["+i+"] = " + ar[i]);
			System.out.println("문자열의 크기 = " + ar[i].length());
			System.out.println("첫번째 문자 = " + ar[i].charAt(0));
			System.out.println("마지막 문자 = " + ar[i].charAt(ar[i].length()-1));
			System.out.println();
		}//for
		
		System.out.println("확장 for");
		for(String data : ar) { // ar이 String이니까 String data로 쓴다
			System.out.println(data);
		}
	}

}

//ar[0] = 호랑이  호(첫번째 문자)	
//ar[1] = 사자	사
//ar[2] = 코끼리	코
//ar[3] = 기린	기
//ar[4] = 하이에나		하
//ar[5] = 긴팔원숭이	긴
//ar[6] = 고릴라		고