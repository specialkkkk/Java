package class__;

//import static java.lang.Math.random; 비추천  어디에 쓰였는지 헷갈리기 때문에 Math.random이 낫다 
//import static java.lang.Math.pow; 비추천 
import static java.lang.Math.*;//wild card ( * = 모든 것)
import static java.lang.String.format;
import static java.lang.System.out;

public class ImportStatic {

	public static void main(String[] args) {
		System.out.println(random());
		System.out.println(pow(2, 5)); // 2의 5승 
		System.out.println(format("%.2f", 45.5678));
		
		
	}

}
