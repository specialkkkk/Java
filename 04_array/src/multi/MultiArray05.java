package multi;

import java.util.Scanner;

public class MultiArray05 {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("인원수: ");
      int cnt = scan.nextInt();
      
      String[] name = new String[cnt];
      int subjectCnt;
      String subject[][] = new String[cnt][];
      int jumsu[][] = new int[cnt][];
      double[] avg = new double[cnt]; 
      
      for(int i=0; i<cnt; i++) { //인원수
         System.out.print("이름 입력: ");
           name[i] = scan.next();
           
           System.out.print("과목수 입력: ");
           subjectCnt = scan.nextInt();
           
           subject[i] = new String[subjectCnt]; //열 생성 //0행에 열2개를 만들어야 하는데 2개들어가는 자리가 바뀔수있으니 subjectCnt로
           for(int j=0; j<subjectCnt; j++) {
              System.out.print("과목명 입력: ");
              subject[i][j] = scan.next(); //열을 j로 바꿈
           }//for j
           
           jumsu[i] = new int[subjectCnt+1];  // +1은 총점 넣기위해서 ( 총점 넣는 열]
           for(int j=0; j<subjectCnt; j++) {
              System.out.print(subject[i][j] + " 점수 입력: ");
              jumsu[i][j] = scan.nextInt();
              
              //총점
              
//            jumsu[0][2] +=    // 0행에 방(열)을 2개 => 방이 2개 이상 바뀔수도 있으니 subjectCnt로 바꿈
              jumsu[i][subjectCnt] += jumsu[i][j];
              
           }//for j
           
           //평균
           avg[i] = (double)jumsu[i][subjectCnt] / subjectCnt;
           
           System.out.println("---------------------");
      }//for i
      
      //출력
      for(int i=0; i<cnt; i++) { //인원수
         
         //타이틀
         System.out.print("이름\t");
         for(int j=0; j<subject[i].length; j++) {
            System.out.print(subject[i][j] + "\t");
         }//for j
         System.out.print("총점\t평균");
         
         //데이터
         System.out.print("\n" + name[i] + "\t");
         for(int j=0; j<jumsu[i].length; j++) { //과목, 총점
            System.out.print(jumsu[i][j] + "\t");
         }//for j
         System.out.println(String.format("%.2f", avg[i]) + "\n");
         
      }//for i
   
   }

}
