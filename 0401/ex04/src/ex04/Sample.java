package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample {
//���� ���α׷� ¥��
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean run = true;
		ArrayList<Report> array = new ArrayList<Report>();
		
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�����Է� | 2.������ȸ | 3.����ǥ | 4.���α׷� ����");		
			System.out.println("-----------------------------------------------");	
			System.out.println("�޴�����> ");
			int menu = s.nextInt();
			switch(menu) {
			case 1 :
				Report r=new Report();
				System.out.print("��ȣ >");
				r.setSno(s.next());
				System.out.print("�̸� >");
				r.setSname(s.next());
				System.out.print("���� >");
				r.setKor(s.nextInt());
				System.out.print("���� >");
				r.setEng(s.nextInt());
				System.out.print("���� >");
				r.setMat(s.nextInt());
				array.add(r);
				
				break;
				
			case 2 :
				System.out.println("��ȸ�� ��ȣ");
				boolean find = false;
				String no = s.next();
				for(int i=0; i<array.size(); i++) {
					r=array.get(i);
					if(no.equals(r.getSno())) {
						r.printReport();
						find=true;
					}
					
				}
				if(find==false) {
					System.out.println("��ȣ�� �����ϴ�.");
				}
				break;
			case 3 :
				System.out.println("����ǥ");
				System.out.println("��ȣ"+"\t"+"�̸�"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"����"+"\t"+"���"+"\t"+"����");
				for(int i=0; i<array.size(); i++) {
					r=array.get(i);
					r.printList();
				}
				break;
			case 4 :
				
				run = false;
			}
		}
		
	}

}