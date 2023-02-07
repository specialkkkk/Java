package multi_;

public class multifor04_test {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i += 3) { //2단부터 3씩 9단까지   2, 5, 8
		      for (int j = 1; j <= 9; j++) { // 1 ~ 9
		        for (int k = i; k < i + 3; k++) {// i=k 2부터시작 2<5 (2,3,4 종료) => 나가지고 처음 for문 부터 다시
		          if (k == 10) { //10에 도달하면 종료
		            break;
		          }
		          System.out.print(k + "*" + j + "=" + k * j + "\t");
		        }
		        System.out.println();
		      }
		      System.out.println();
		    }
		
	} 
    
}



//구체적으로, 첫 번째 for문에서 i라는 변수의 값을 가지고 k 변수를 초기화합니다. 
//그런 다음 2번째 for문에서 k 변수를 증가시켜 값이 i + 3이 될 때까지 반복합니다.
//그리고, 3번째 for문에서 k 값이 10이 되면 if문이 실행되어 break 명령을 실행하여 반복문을 즉시 종료합니다.