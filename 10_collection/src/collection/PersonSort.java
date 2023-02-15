package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.println("정렬 전 = ");
		for(String data :ar) {
			System.out.print(data+ " ");
		}
		System.out.println();
		
		Arrays.sort(ar);
		
		System.out.println("정렬 후 = ");
		for(String data :ar) {
			System.out.print(data+ " ");
		}
		System.out.println();
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("라이언", 35);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		System.out.println();
		System.out.println("나이로 정렬 전");
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
		System.out.println();
		
		
		
		
		Collections.sort(list); //정렬
		
		System.out.println("나이로 오름차순 정렬 후");
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
		System.out.println();
		
		
		
		System.out.println("이름으로 내림차순"); //<> = generic
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {//comparator = 인터페이스 = new 불가 => 키다리아저씨 
			
			@Override
			public int compare(PersonDTO dto1, PersonDTO dto2) {
			
//			return dto1.getName().compareTo(dto2.getName()); //이름 오름차순  // 여기서 * -1 해도 내림차순 가능
			return dto2.getName().compareTo(dto1.getName()); //이름 내림차순(dto2먼저)
			
			}
		}; 
		
		
		
		
		Collections.sort(list, com);
		
		System.out.println("정렬 후");
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
		System.out.println();
		
		
	}
}
