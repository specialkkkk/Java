package member;



public class MemberMain {
//	private long serialVersionUID = 1L;      serial의 버전을 1로 통일

	public static void main(String[] args) {
		MemberService memberService = new MemberService();  //대문자 클래스 ,  소문자 객체
				   // memberService =객체   주소를 가지고있다
		memberService.menu();// 호출
		System.out.println("프로그램 종료합니다");

	}

}
/*
[문제] 회원관리

* 조건
- 회원을 입력받아서 파일에 저장하거나 파일의 내용을 읽어온다.
- MemberService 클래스에 메뉴 메소드 작성한다.
  메뉴에 따라 각각의 클래스를 작성한다.
- 회원의 정보는 이름, 나이, 핸드폰, 주소로 한다.

1. 클래스 작성
MemberMain.java

MemberService.java
- 메뉴 작성

MemberDTO.java
- 필드, 생성자, setter, getter

MemberInsert.java // 입력
MemberPrint.java // 입력한걸 확인
MemberPhoneSearch.java
MemberNameAsc.java
MemberFileInput.java 
MemberFileOutput.java

2. 인터페이스 작성

Member.java
- 추상메소드 public void execute();


menu()
********************
  1. 등록
  2. 출력
  3. 핸드폰 검색
  4. 이름으로 오름차순
  5. 파일 저장
  6. 파일 읽기
********************
  번호 : 
*/