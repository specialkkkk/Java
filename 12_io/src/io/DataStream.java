package io; //input output 약자

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {
	try {
		//DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt"));
		//								반드시 안에 있는것 먼저 처리
		//이렇게 2줄로도 쓸 수 있다 => 
		FileOutputStream fos = new FileOutputStream("result.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		//데이터가 3개니까 write 3번
		dos.writeUTF("홍길동");
		dos.writeInt(25);
		dos.writeDouble(185.3);
		
		dos.close();//수도꼭지 잠금
		
		
		//파일읽기
		DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
		String name = dis.readUTF(); //읽어온 파일을 name에 보관하라
		int age = dis.readInt();
		double height = dis.readFloat();
		
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("키 = " + height);
		
		dis.close();
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
