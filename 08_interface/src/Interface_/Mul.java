package Interface_;

import java.util.Scanner;

public class Mul implements Compute {

private int x, y;
	
	
	public Mul() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x의 값 입력 : ");
		x = sc.nextInt();
		System.out.println("y의 값 입력 : ");
		y = sc.nextInt();
	}
	
	
	@Override
	public void disp() {
		System.out.println(x + " * " + y + " = "+(x*y));

	}
}