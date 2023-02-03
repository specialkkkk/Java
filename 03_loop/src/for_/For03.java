package for_;

public class For03 {

	public static void main(String[] args) {
		int i, sum=0, mul=1; // sum=0을 안하면 에러
		
		/*	
		i=1; //1
		sum = sum + 1; //1
		
		i=2; 
		sum = sum + 2; //3
		
		i=3; 
		sum = sum + 3; //6
		
		i=10;
		sum = sum + 10; //55
		 */
		
		for(i=1; i<=10; i++) { //i는 1부터 10까지
			sum += i; //같은말 =>sum = sum + i
			mul *= i;//mul = mul * i
			
			System.out.println(i + "\t" + sum + "\t" + mul);
			
		}//for
		
		
		
	}

}
