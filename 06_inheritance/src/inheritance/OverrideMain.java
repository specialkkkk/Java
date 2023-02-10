package inheritance;


class AA {
	public int a = 3;
	
	public void disp( ) {
		a += 5;
		System.out.print("AA : " + a + " ");
	}
}

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
class BB extends AA {
	public int a = 8;
	
	public void disp() {
		this.a += 5;
		System.out.print("BB : " + a + " ");
	}
}

//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ




public class OverrideMain {
	
	

	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp();  //  BB : 13
		System.out.println("aa : " + aa.a); //13
		System.out.println();
		
		AA dd = new AA();
		dd.disp(); 
		System.out.println("dd: " +  dd.a); //5(a) + 3 = 8
		System.out.println();
				
	}

}
