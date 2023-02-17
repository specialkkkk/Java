package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		PersonDTO dto = new PersonDTO("홍길동", 25, 185.3);
		
		//파일로 출력
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		oos.writeObject(dto); //dto ( 객체)로 한번에 write
		oos.close();
		
		//파일의 내용을 읽어오기 //객체니까 get으로 
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		
		PersonDTO dto2 = (PersonDTO)ois.readObject();//캐스팅 =>(자식)부모
//		PersonDTO(자식)		              Object(부모)
		
		
		
		             				//객체니까 get으로
		System.out.println("이름 = " + dto2.getName());
		System.out.println("나이 = " + dto2.getAge());
		System.out.println("키 = " + dto2.getHeight());
		
		
	}

}
