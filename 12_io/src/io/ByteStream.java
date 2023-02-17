package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException{ //jvm(자바머신)에게 던짐 (오류에 대비해서 너가 처리해)
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("data.txt")));
		
		int data;
		
		     //﻿마지막에 읽을 것이 없을 때 -1 = 끝이라는 표시
		while( (data=bis.read()) != -1 ){// 읽어온 내용을 data에 보관하라 //while -1이 아닐 때 까지 반복하라
			System.out.print((char)data);
			//(data)=65666768131049505152131043454247
			//(char)data=ABCD 1234 +-*/
						
		}
		System.out.println();
	}

}
//문자 0 = 아스키코드 48
//엔터 = 1310