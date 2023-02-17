package collection;

import java.util.Stack;
import static java.lang.System.out;

public class StackMain {//크게 필요는 없다

	public static void main(String[] args) {
		String[] groupA = {"우즈베키스탄", "쿠웨이트"	, "사우디", "대한민국"};
		
		Stack<String> stack = new Stack<String>();
		
		for(int i=0; i<groupA.length; i++) stack.push(groupA[i]);
		
		while( ! stack.isEmpty() ) //!=반대
			
			out.println( stack.pop());
		
	}

}
