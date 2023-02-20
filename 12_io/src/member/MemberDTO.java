package member;

import java.io.Serializable;

public class MemberDTO implements Serializable{//직렬화 
	private String name;
	private int age;
	private String phone;
	private String adrress;
	
	
	public MemberDTO(String name, int age, String phone,  String adrress) {//순서중요
		super();
		this.age = age;
		this.name = name;
		this.phone = phone;
		this.adrress = adrress;
		
		
	}


	public String getphone() {
		return phone;
	}


	public void setphone(String phone) {
		this.phone = phone;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAdrress() {
		return adrress;
	}


	public void setAdrress(String adrress) {
		this.adrress = adrress;
	}
	@Override
	public String toString() {
		return name+"\t"+age+"\t"+phone+"\t"+adrress; //멤버DTO는 가지고 있는 주소가 안나오고 이렇게 바뀌어서 나온다
	}
//	@Override
//	public int comparTo(MemberDTO m) {
//		return name.compareTo(m.getName());
//	}
	
}
