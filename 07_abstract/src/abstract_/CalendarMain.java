package abstract_;

import java.util.Calendar;
import java.util.Scanner;

class CalendarEx {
    private int year;
    private int month;
    private int week;

    public CalendarEx(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int calc() {
        Calendar calendar = Calendar.getInstance();
        
     // 생성할 때 기준인 시스템 날짜, 시간을 내가 원하는 날짜와 시간으로 변경 해야함
        //cal.set(Calendar.YEAR, this.year); //년도
        //cal.set(Calendar.MONTH, this.month-1);//월
        //cal.set(Calendar.DAY_OF_MONTH, 1); //일
        calendar.set(year, month-1, 1);// 연, 월, 일
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public int lastDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, 1);
        return calendar.getActualMaximum(Calendar.DATE);
    }

    public void display() {
        System.out.println("일   월    화   수   목   금   토");
        System.out.println("-------------------------------------");

        int startDay = calc();
        int lastDay = lastDay();

        for (int i = 1; i < startDay; i++) {//시작점 잡기
            System.out.print("     ");
        }

        for (int i = 1; i <= lastDay; i++) { //1월부터 lastday까지
            System.out.printf("%2d   ", i);

            if ((i + startDay - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

public class CalendarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도 입력 : ");
        int year = sc.nextInt();
        System.out.print("월 입력 : ");
        int month = sc.nextInt();

        CalendarEx calendar = new CalendarEx(year, month);
        calendar.display();
    }
}




/*
[문제] 만년달력
- 년도, 월을 입력하여 달력을 작성하시오
- 기본생성자 : 입력

         
클래스명 : CalendarEx
필드 : 
메소드 : 기본 생성자 : 월, 일 입력
calc() = 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
         display() 출력
         
         
클래스명 : CalendarMain

[실행결과]
년도 입력 : 2002
월 입력 : 10   

일   월    화   수   목   금   토
     1    2    3   4    5
6    7    8    9   10   11   12
13   14   15   16   17   18   19
20   21   22   23   24   25   26
27   28   29   30   31
*/