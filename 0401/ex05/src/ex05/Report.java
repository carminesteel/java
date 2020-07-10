package ex05;

import java.text.DecimalFormat;

public class Report {//성적관리용
	
	//필드
	private String sno;
	private String sname;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private char grade;		//학점(90이상:A 80이상:B 70이상:C 70이하:F)

	
	//생성자
	//기본생성자 쓸것이라 생략
	
	//메소드
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		tot=kor+eng+mat;
		return tot;
	}
	public void setTot(int tot) { //노필요
		this.tot = tot;
	}
	public double getAvg() {
		avg=(getTot())/3.; //tot값을 받아서 나누기3 한 값이 avg
		return avg;
	}
	public void setAvg(double avg) { //노필요
		this.avg = avg;
	}
	public char getGrade(){
		if(getAvg()>=90){
			grade ='A';
		}else if(getAvg()>=80) {
			grade ='B';
		}else if(getAvg()>=70) {
			grade ='C';
		}else {
			grade ='F';
		}		
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void printReport() {
		System.out.println("번호:" + sno);
		System.out.println("이름:" + sname);
		System.out.println("국어:" + kor);
		System.out.println("영어:" + eng);
		System.out.println("수학:" + mat);
		System.out.println("총점:" + getTot());
		DecimalFormat df=new DecimalFormat("###.00");
		System.out.println("평균:" + df.format(getAvg()));
		System.out.println("학점:" + getGrade());
	}
	
	public void printList() {
		
		System.out.print(sno + "\t");
		System.out.print(sname + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(getTot() + "\t");
		DecimalFormat df=new DecimalFormat("###.00");
		System.out.print(df.format(getAvg()) + "\t");
		System.out.println(getGrade());
	}
}	
