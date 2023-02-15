package collection;

public class PersonDTO implements Comparable<PersonDTO> { //1인분 // <PersonDTO>로 정렬하겠다
	private String name;
	private int age;
	
	public PersonDTO (String name, int age) {//생성자(이름, 나이)
		this.name = name;
		this.age = age;
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
	
	@Override // toS =>  ctrl+space
		public String toString() {
			return name + "\t" + age;
		}
	
	@Override
	public int compareTo(PersonDTO dto) {
		//age순으로 오름차순
		if(this.age < dto.age) return -1;
		else if(this.age > dto.age) return 1;
		return 0;
	}

}
