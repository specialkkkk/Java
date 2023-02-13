package abstract_;

public abstract class AbstractTest { //POJO (Plain Old Java Object)형식  (오리지날 방식) =생성자, setter ,getter
	protected String name;
	
	public AbstractTest() {
		
	}
	
	
	
	
	public AbstractTest(String name) { //생성자
		super();
		this.name = name;
	}

	
	
	
	
	public abstract void setName(String name); //추상 메소드 
	            
		
	public String getName() {// 구현
		return name;
	}


}
