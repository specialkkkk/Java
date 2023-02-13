package abstract_;

public class AbstractMain extends AbstractTest { // 추상클래스 

	@Override // 자식 클래스에 무조건 오버라이드
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {

		AbstractTest at = new AbstractMain();
		
		at.setName("홍길동");
		System.out.println(at.getName());
		
		
		
	}

}
