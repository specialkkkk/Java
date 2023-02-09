package constructor;
			//DTO = 1인분  Data Transfer Object 데이터 이동 객체
public class MemberDTO { 
	
//	생성자를 통해서 데이터 4개를 받아온다. ( 이름 나이 핸드폰 주소)
	private String name;
	private int age;
	private String phone;
	private String address;
	
	public MemberDTO(String name, int age, String phone, String address) {           
//	(String n, int a)이렇게 써도 되지만 이름을 똑같이 하면 어디로 전달되는지 보기가 편함)
	this.name = name;
	this.age = age;
	this.phone = phone;
	this.address = address;
	}
	public String getName() {
		return name;
	}
	


	
	public int getAge(){
		return age;
	}
	
	public String getPhone(){
		return phone;
	}
	public String getAddress(){
		return address;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
		
	}
	public void setAddress(String address) {
		this.address = address;
		
	}
		
		
		
		


}
