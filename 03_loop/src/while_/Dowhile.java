package while_;

public class Dowhile {

	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10
				int a = 0; // a가 원래 값(garbage)이 있으므로 0부터 지정
				do {
					a++;
					System.out.print(a + " ");
					
				}while(a<10); //Dowhile
				System.out.println();
				
				// A B C D E F ~~~~ X Y Z  7개씩 나누어 출력해보자
				char ch = 'A';
				int count = 0; // 증가시키기 때문에 처음값이 무조건 0 으로
				do {
					System.out.println(ch + " ");
					ch++; // sysout 먼저해서 A를 나타내고 => 증감(++)
						  // sysout 먼저 하지 않으면 B부터 나온다.
					
					count++; // 개수 증가 = 1 2 3  ~ ~ 
					if (count % 7 == 0) System.out.println();
					// 7의 배수입니까? = 7로 나누어 나머지가 0과 같다.
				}while(ch <= 'Z');
				

	}

}
