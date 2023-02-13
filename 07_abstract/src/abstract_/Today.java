package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {

	public static void main(String[] args) throws ParseException { // throws = 보험 / 에러뜨면 알아서 처리해라
		Date date = new Date(); //시스템의 시간과 날짜
		System.out.println("오늘 날짜 : " + date);  //오늘 날짜 : Mon Feb 13 15:35:00 KST 2023
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 HH:mm:ss");
		System.out.println("오늘 날짜 : " + sdf.format(date)); // 오늘 날짜 : 2023년 02월 13일 15:35:00
		System.out.println();
		
		//입력 - 내생일
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19910715091415"); // "1991어쩌꾸"= String -> Date형 변환 
//		예외처리 = 생각지도 않은 에러  1. 컴파일(예방용, 보험) throws  2. 실행(개발자 실수)
//				ArrayIndexOutOfBoundsException = 배열 잘못줌
		System.out.println("내 생일 = "+ birth);
		System.out.println("내 생일 = "+ sdf.format(birth));
		System.out.println();
		
//		Calendar cal = new Calendar(); = 추상클래스라 에러
		
		//기준은 시스템 날짜와 시간
		Calendar cal = new GregorianCalendar();//Sub Class
		Calendar cal2 = Calendar.getInstance();//메소드
		
		int year = cal.get(Calendar.YEAR);  //cal.get(1) 원래 이렇게 쓰는데  => 못 알아보기 때문에 값을 상수화=> YEAR
		int month = cal.get(Calendar.MONTH) + 1; //컴퓨터는 1월을 0으로 생각한다  //cal.get(2)
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(cal.DAY_OF_WEEK); // 일요일 = 1 , 월요일 = 2 // 결과 : 2요일
		
		//2요일을 월요일로 바꾸기
		
		String dayOfWeek = null;  // String 타입의 초기값은 null
		switch(week)	{ //break 안걸면 어떤 날이건 토요일로 나옴
		case 1 : dayOfWeek = "일"; break;
		case 2 : dayOfWeek = "월"; break;
		case 3 : dayOfWeek = "화"; break;
		case 4 : dayOfWeek = "수"; break;
		case 5 : dayOfWeek = "목"; break;
		case 6 : dayOfWeek = "금"; break;
		case 7 : dayOfWeek = "토"; break;
		}
	   
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(year+"년 " + month+ "월 " + day +"일 "+ dayOfWeek + "요일"+ hour + "시 " + minute + "분 " + second + "초");
		
	}

}