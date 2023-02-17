package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException; => IOException으로 바꿈
import java.io.IOException;

public class ByteStream2 {

	public static void main(String[] args) {
		try {
			File file = new File("data.txt");
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			int size = (int)file.length();// 파일 크기
			byte[] b = new byte[size];
			
			bis.read(b, 0, size);
			System.out.println(new String(b)); //byte[] -> String    b를  변환
											   // 기본형    객체형    => new 써줘야함
			bis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
