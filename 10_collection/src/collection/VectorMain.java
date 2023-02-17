package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {//크게 필요는 없다

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = " + v.size()); //0
		System.out.println("벡터 용량 = " + v.capacity()); //기본용량 10, 10개씩 증가
		System.out.println();
	
		System.out.println("항목 추가");
		for(int i=0; i<10; i++) {
			v.add(i+1+""); //1부터시작하게 +1해준다 
			System.out.print(v.get(i) + " ");
		}//for   = > 10개로 증가
		
		
		System.out.println();
		System.out.println("벡터 크기 = " + v.size()); //10
		System.out.println("벡터 용량 = " + v.capacity()); //10
		System.out.println();
	
		
		System.out.println("항목 1개 추가");
		v.addElement(5 + " "); //중복 허용 //결과 1 2 3 4 5 6 7 8 9 10 5
		System.out.println("벡터 크기 = " + v.size()); //11
		System.out.println("벡터 용량 = " + v.capacity()); //20
		System.out.println();
		
		for(int i=0; i<v.size(); i++) System.out.print(v.get(i) + " ");	
		System.out.println();
		
		
		
		/*
		
		System.out.println("마지막 항목 삭제");
		v.remove("5");//현재 5가 2개인데 ,처음에 만난 항목을 제거한다★
		//현재 5가 String 타입이므로 "5" 써준다
		
		Iterator<String> it = v.iterator(); //생성
		while(it.hasNext()) { // 항목이있으면 꺼내고 다음으로 이동
			System.out.print(it.next() +" ");
		}
		System.out.println();
		
		
		*/
		
		
		
		
		System.out.println("마지막 항목 삭제");
		v.remove(10);//10번 위치의 항목을 삭제 ★
		
		Iterator<String> it = v.iterator(); //생성
		while(it.hasNext()) { // 항목이있으면 꺼내고 다음으로 이동
			System.out.print(it.next() +" ");
		}
		System.out.println();
		
		
	}

}

