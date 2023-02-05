package for_;

import java.util.Scanner;

public class For06_test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int i = sc.nextInt();
		int result =1;
		for(int x =1;x<=i;x++) {
			result *=x;
		}System.out.println(i+"! = "+result);

}
}