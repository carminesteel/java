package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
				
		boolean run = true;
		Scanner s=new Scanner(System.in);
		Grade[] grade=new Grade[100];
		int count = 0;
		
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.�����Է� | 2.������� | 3.������ȸ | 4.����");
			System.out.println("-----------------------------------------");
			System.out.println("�޴����� >");
			int menu=s.nextInt();
			switch(menu) {
			case 1:

				grade[count]=new Grade();
				System.out.println("�й�>");
				grade[count].sno=s.next();
				System.out.println("����>");
				grade[count].sname=s.next();
				System.out.println("����>");
				grade[count].kor=s.nextInt();
				System.out.println("����>");
				grade[count].eng=s.nextInt();
				System.out.println("����>");
				grade[count].mat=s.nextInt();
				System.out.println("�Է¿Ϸ�\n");
				
				count++;
				
				break;
			case 2:
				for(int i=0; i<count; i++) {
					grade[i].printGrade();
				}
				break;
			case 3:
				//�Է�
				System.out.println("��ȸ�� ��ȣ");
				String no=s.next();
				
				boolean find=false;
				for(int i=0; i<count; i++) {
					if(no.equals(grade[i].sno)) {
						System.out.println("���� : " + grade[i].sname);
						System.out.println("���� : " + grade[i].kor);
						System.out.println("���� : " + grade[i].eng);
						System.out.println("���� : " + grade[i].mat);
						System.out.println("��� : " + grade[i].avg);
						find=true;
					}
				}
				if(find==false) {
					System.out.println("��ȣ�� �������� �ʽ��ϴ�.");
				}
			
				break;
			case 4:
				run=false;
				System.out.println("���α׷� ����");
				
			}
		}
		
		
		
	}

}