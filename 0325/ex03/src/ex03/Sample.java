package ex03;

import java.util.Scanner;

public class Sample {

	public static void method1() {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int scan = s.nextInt();
	}
	
	
	public static void main(String[] args) {
		boolean run = true;
		int speed = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("����ӵ� �Է�");
		speed = s.nextInt();
	
		while(run) {				

			System.out.println("-------------------------");
			System.out.println("1. ���� | 2. ���� | 3.���� | 4.�ӵ�Ȯ��");
			System.out.println("-------------------------");
			
			int menu = s.nextInt();
		
			switch (menu) {
			case 1 :


				System.out.print("���� 1 : \n");

				speed = speed +1;
				System.out.print("���� �ӵ� = " + (speed) + "\n");
				break;
				
			case 2 : 
				System.out.println("����ӵ� �Է�");
				System.out.print("���� 2 : \n");
			
				speed = speed -1;
				System.out.print("���� �ӵ� = " + (speed) + "\n");
				break;	
				
			case 3 : 
				System.out.print("���� 3 : \n");
				System.out.print("���α׷� ���� \n");
				run = false;
				break;
				
			case 4 : 
				System.out.println("���� �ӵ��� " + speed + "�Դϴ�." );
				break;
			default : 
				System.out.println("�߸��� ��");
			}
	
		}
	}		
}

