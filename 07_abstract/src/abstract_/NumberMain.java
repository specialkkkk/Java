package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		// NumberFormat nf = new NumberFormat(); = 추상클래스라 에러남
		
		
		
		//3자리마다 ,를 찍고 소수이하 3자리까지 출력
		NumberFormat nf = new DecimalFormat(); //10진법이라  (Sub class) Decimal 이용해서 생성
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원"); 
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));  //12,345,678원
		System.out.println();
		
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원"); 
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678)); //12,345,678.00원
		System.out.println();
		
		NumberFormat nf4 = NumberFormat.getInstance();// 메소드 이용하여 생성
		nf4.setMaximumFractionDigits(2);//소수이하 2자리
		nf4.setMinimumFractionDigits(2);
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		
		//NumberFormat nf5 = NumberFormat.getInstance();// 메소드 이용하여 생성
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US); //$
		nf5.setMaximumFractionDigits(2);//소수이하 2자리
		nf5.setMinimumFractionDigits(2);
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
		
		
		
		
	}

}
