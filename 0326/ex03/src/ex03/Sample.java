package ex03;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean run = true;
		String[] no = new  String[100]; /*no �� 100��*/
		String[] name = new String[100]; /*name �� 100��*/
		String[] address = new String[100];	/*address �� 100��*/
		int count = 0; // count ����
			while (run) {
				System.out.println("--------------------------------------------");
				System.out.println("1.�ּ��Է� | 2. �ּҸ�� | 3.�ּ���ȸ | 4.����");
				System.out.println("--------------------------------------------");
				System.out.print("���� > ");
				int menu = s.nextInt();
				
					switch(menu) {
						case 1 : //�ּ��Է�

							System.out.println("--------------------------------------------------");
							System.out.println("�ּ��Է�");
							System.out.println("--------------------------------------------------");
							System.out.print("��ȣ > ");
							no[count]=s.next();
							System.out.print("���� > ");
							name[count]=s.next();
							System.out.print("�ּ� > ");
							address[count]=s.next();
							
							System.out.print("��� :  �л��� �ԷµǾ����ϴ�. ");
							count = count +1;
							
							break;
						case 2 : //�ּҸ��
							for(int i = 0; i<=count-1; i++) {
							System.out.println("-------------------------------------------------");
							System.out.println(no[i] + " \t" + name[i] + " \t" + address[i]);
							}
							break;
						case 3 : //�ּ���ȸ
							String number=s.next();
							System.out.println("�������ȸ?");
								for(int i=0; i <=count-1; i++) {
								
									if(no[i].equals(number)) {
										System.out.println("���� : " + name[i]);
										System.out.println("�ּ� : " + address[i]);
								}
							
							}
							
							break;
						case 4 : //����
							run = false;
							System.out.println("���α׷� ����");
							
					}
				
			}
			
		
		
	}

}