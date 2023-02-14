package Interface_;

public class ComputeMain {

	public static void main(String[] args) {
		ComputeService computeService= new ComputeService();  //대문자 클래스 ,  소문자 객체
		computeService.menu();// 호출
		System.out.println("프로그램 종료합니다");
	}

}
