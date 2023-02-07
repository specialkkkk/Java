package multi;

public class MultiArray03 {

	public static void main(String[] args) {
//		String name1="홍길동";
//		String name2="프로도";
//		String name3="죠르디";  배열로 만들기
		String[] name = {"홍길동", "프로도", "죠르디"};
		int[][] jumsu = {{91,95,100,0}, {100,88,75,0},{75,80,48,0}}; // 점수를 jumsu로 다차원 배열로 만들기 *0은 총점
		double[] avg = new double[3];  //평균
		char[] grade = new char[3];  //학점
		
		//총점, 평균,학점
//			  i  3(고정)		 i  j
//		jumsu[0][3] += jumsu[0][0]
//					   jumsu[0][1]
//					   jumsu[0][2] =  홍길동 점수
//					   
//		jumsu[1][3] += jumsu[1][0]
//				            [1][1]
//				            [1][2] =  프로도점수 
//				            
//				            
//		jumsu[2][3] += jumsu[2][0]
//		                    [2][1]
//					        [2][2] =  프로도점수 
									   			//총점은 계산해야해서 빠져있음	   
					   
					   
					   
					   
		for(int i=0; i<jumsu.length; i++) { // i<3 = i<jumsu.length  그런데 총점이 빠져있으니 -1
	       
	        for(int j=0; j<jumsu.length-1; j++) {
	        	
	         jumsu[i][3] += jumsu[i][j]; // 총점//jumsu[i][j] 배열의 각 요소의 합을 누적하여 jumsu[i][3]에 저장
	        }
	        
	        avg[i] = (double) jumsu[i][3]  / 3; //평균
	        if(avg[i] >= 90) grade[i] = 'A'; //만약 평균이 90이상이면 학점은 A
	        else if(avg[i] >= 80) grade[i] = 'B'; //그게아니고 80점이상 이면 B    90이상아니고>B>=80
	        else if(avg[i] >= 70) grade[i] = 'C'; //그게아니고 70 ''
	        else if(avg[i] >= 60) grade[i] = 'D';//  60 ''
	        else grade[i] = 'F';
	    }
		
		
		//출력  ( 첫번째줄부터 가로로 출력하면서 내려가야함) 세로로 찍으면 수정불가
				
//	        System.out.println(name[0]+"\t"+jumsu[0][0]+"\t"+avg[0]+"\t"+grade[0]);
//	        								jumsu[0][1]
//	        								jumsu[0][2]
//	        								jumsu[0][3]
//	        										
//	        System.out.println(name[1]+"\t"+jumsu[0][0]+"\t"+avg[1]+"\t"+grade[1]);
//	        								jumsu[0][1]
//	        								jumsu[0][2]
//	        								jumsu[0][3]
//	        										
//	        System.out.println(name[2]+"\t"+jumsu[0][0]+"\t"+avg[2]+"\t"+grade[2]);
//	        								jumsu[0][1]
//	        								jumsu[0][2]
//	        								jumsu[0][3]										
	        	System.out.println("------------------------------");							
	       System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("--------------------------");
		
		for(int i=0; i<jumsu.length; i++) {
	    	 System.out.print(name[i]+"\t");  
	    	 
	    	 for(int j=0; j<jumsu[i].length; j++) {// 국어 영어 수학 총점 (총점까지 들어가기 때문에 -1안해도된다)
	    		 System.out.print(jumsu[i][j] + "\t");
	    	 } //for j
	    	 
	    	 System.out.println(String.format("%.2f", avg[i]) + "\t" + grade[i]);
	      } //for i
		
		
		
		
	        		
	        
	        
	        
	        
	}

}






/*[문제] 성적처리
- 총점, 평균, 학점을 구하시오.
- 평균은 소수이하 2자리까지 출력

총점 = 국어 + 영어 +수학
평균 = 총점 / 과목수
학점은 평균이 90이상이면 'A'
	  평균 80이상 'B'
	  평균 70이상 'C'
	  평균 60이상 'D'
	  그 외는 'F'
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동     90       95      100
프로도     100      89      75
죠르디     75       80      48
----------------------------------------------------
 */
