package member;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class MemberFileOutput implements Member {
	
	@Override //오버라이드 = 부모와 자식에게 똑같이 걸림 /throws하면 모든 자식들에게 throws 전부 걸어야 함....
											   // 전부 걸기 보다는 try ,catch로 이 파일만 걸자
	public void execute(List<MemberDTO> list) {
		System.out.println();
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member.txt"));
			
			for(MemberDTO memberDTO : list) {
				oos.writeObject(memberDTO);
			}
			
			oos.close();
			System.out.println("파일에 저장 완료");
			
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
	}

}
