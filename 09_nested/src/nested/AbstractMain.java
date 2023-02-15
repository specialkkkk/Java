package nested;

public class AbstractMain {

	
	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() {//익명 inner 클래스
			
			public void setName(String name) {//구현
				this.name = name;
			}
	 };//키다리아저씨
	 Inter A in = new InterA() {//인터페이스를 new한게 아니다 = 키다리 아저씨 소환
		 public void aa() {}
		 public void bb() {}
	 }; // interface를 쓸수 있도록 도와주는 키다리 아저씨=익명inner클래스= 한번쓰고 버리자
	 AbstractExam ae = new AbstractExam() {
		//원하는 메소드를 Override 한다...두끼  
	 };
	}

}
