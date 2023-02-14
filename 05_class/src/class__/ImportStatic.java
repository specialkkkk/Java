package class__;

//import static java.lang.Math.random; 비추천 
//import static java.lang.Math.pow; 비추천
import static java.lang.Math.*;//wild card ( * = 모든 것)

public class ImportStatic {

	public static void main(String[] args) {
		System.out.println(random());
		System.out.println(pow(2, 5)); // 2의 5승 
		System.out.println(String.format("%.2f", 45.5678));
		
		
	}

}
