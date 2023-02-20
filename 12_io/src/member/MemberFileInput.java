package member;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class MemberFileInput implements Member {

	@Override
	public void execute(List<MemberDTO> list) {
		System.out.println();
		
		list.clear(); //리스트 지우기 (초기화)
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("member.txt"));
			
			
			
//			-> member.txt 파일의 내용을 읽어서 List 보관하세요 = > 2번 호출하면 데이터 출력된다
//			-> 파일의끝입니까? EOFException (End Of File)
			while(true) {
				try { 
					MemberDTO memberDTO = (MemberDTO)ois.readObject(); //캐스팅 걸기= (MemberDTO)
					list.add(memberDTO);
				}catch(EOFException e ){
					break;
				}
			}
			
			ois.close();
			System.out.println("파일에 읽기(불러오기) 완료");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}

