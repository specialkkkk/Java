package operator;

public class Operator03 {

	public static void main(String[] args) {
		int a=5;
		a += 2;//a = a + 2;    //a=a+1 ->  a+=1   ->  ++a 선행 =  a++ 후행
		a *= 3;
		a /= 5;
		System.out.println("a = " + a); //4
		
		a++;
		System.out.println("a = " + a); //5
		
		int b = a++;
		System.out.println("a = " + a + " b = " + b); //  a = 6 b = 5
		                    
		int c = ++a * b--;
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		
		System.out.println("a++ = " + a++);
		System.out.println("a = " + a);
	}

}
