package ex03;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
		/*
		Report[] report=new Report[100];
		int count = 0;
		report[0]=new Report();
		report[0].setSno("01");
		report[0].setSname("홍길동");
		report[0].setKor(90);
		report[0].setEng(90);
		report[0].setMat(90);
		count++;		
		report[1] = new Report();
		report[1].setSno("02");
		report[1].setSname("심청이");
		report[1].setKor(80);
		report[1].setEng(80);
		report[1].setMat(80);
		count++;
		System.out.println("번호"+"\t"+"이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균"+"\t"+"학점");
		
		for(int i=0; i<report.length; i++) {			
			report[i].printList();		
		}*/
		
		//ArrayList 사용 - 데이터를 넣을때바다 방 생성		
		ArrayList<Report> array=new ArrayList<Report>();
		
		Report r = new Report();
		
		r.setSno("01");
		r.setSname("홍길동");
		r.setKor(97);
		r.setEng(57);
		r.setMat(59);
		array.add(r);
		
		r= new Report();
		
		r.setSno("02");
		r.setSname("홍길떵");
		r.setKor(25);
		r.setEng(64);
		r.setMat(89);
		array.add(r);
		
		System.out.println("번호"+"\t"+"이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균"+"\t"+"학점");
		
		for(int i=0; i<array.size(); i++) {
			r=array.get(i);
			r.printList();
		}
		
	}

}
