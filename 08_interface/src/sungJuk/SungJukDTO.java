package sungJuk;

public class SungJukDTO {
	private int no;
	private String name;
	private int kor, eng, math, tot;
	private double avg; //여기까지가 필드
	
	public SungJukDTO(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public void calc() {
		tot = kor + eng + math;
		avg = tot / 3.0; //3 이면 소수점 안나오니 3.0으로 캐스팅
		
	}// 우클릭 source  => getter & setter => all 
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
		
		@Override
		public String toString() {
			return no+"\t+name+\t+kor"\t"+eng+"\t"+math+"\t" "
		}
	}
}
