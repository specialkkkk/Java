package member;

import java.util.Collections;
import java.util.List;

public class MemberNameAsc implements Member {

	// execute 메서드를 오버라이딩합니다.
	@Override
	public void execute(List<MemberDTO> list) {
		// 새 줄을 출력합니다.
		System.out.println();

		// Collections.sort 메서드를 사용하여 list를 이름(name) 기준으로 오름차순 정렬합니다.
		Collections.sort(list, (m1, m2) -> m1.getName().compareTo(m2.getName()));

		// list의 모든 MemberDTO 객체에 대해 출력합니다.
		for(MemberDTO memberDTO : list) {
			System.out.println(memberDTO);
		}
	}

}