package member; 

import java.util.List; 
import java.util.Scanner;

public class MemberPhoneSearch implements Member { // Member 인터페이스를 구현하는 MemberPhoneSearch 클래스

    @Override
    public void execute(List<MemberDTO> list) { // Member 인터페이스의 execute 메서드 오버라이드
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        System.out.print("검색할 핸드폰 번호를 입력하세요 : "); // 화면에 메시지 출력
        String phone = sc.nextLine(); // 키보드로부터 핸드폰 번호 입력받기

        System.out.println("전화번호\t이름\t나이\t주소"); // 화면에 메시지 출력
        System.out.println("-------------------------------------------"); // 화면에 메시지 출력

        boolean found = false; // found 변수 초기화

        for (MemberDTO member : list) { // list의 모든 MemberDTO에 대해 반복문 실행
            if (member.getphone().equals(phone)) { // 입력받은 phone과 MemberDTO의 phone이 같으면
                System.out.println(member.toString()); // 해당 MemberDTO를 출력
                found = true; // found를 true로 설정
            }
        }

        if (!found) { // found가 false일 경우
            System.out.println("검색 결과가 없습니다."); // 화면에 메시지 출력
        }
    }
}


