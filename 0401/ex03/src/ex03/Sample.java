package ex03;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
		/*
		Report[] report=new Report[100];
		int count = 0;
		report[0]=new Report();
		report[0].setSno("01");
		report[0].setSname("ȫ�浿");
		report[0].setKor(90);
		report[0].setEng(90);
		report[0].setMat(90);
		count++;		
		report[1] = new Report();
		report[1].setSno("02");
		report[1].setSname("��û��");
		report[1].setKor(80);
		report[1].setEng(80);
		report[1].setMat(80);
		count++;
		System.out.println("��ȣ"+"\t"+"�̸�"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"���"+"\t"+"����");
		
		for(int i=0; i<report.length; i++) {			
			report[i].printList();		
		}*/
		
		//ArrayList ��� - �����͸� �������ٴ� �� ����		
		ArrayList<Report> array=new ArrayList<Report>();
		
		Report r = new Report();
		
		r.setSno("01");
		r.setSname("ȫ�浿");
		r.setKor(97);
		r.setEng(57);
		r.setMat(59);
		array.add(r);
		
		r= new Report();
		
		r.setSno("02");
		r.setSname("ȫ�涺");
		r.setKor(25);
		r.setEng(64);
		r.setMat(89);
		array.add(r);
		
		System.out.println("��ȣ"+"\t"+"�̸�"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"���"+"\t"+"����");
		
		for(int i=0; i<array.size(); i++) {
			r=array.get(i);
			r.printList();
		}
		
	}

}
