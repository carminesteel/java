package ex02;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int max = -9999;
		int min = 9999;
		
		int[] scores = null;  //�������� (switch�� ��ü�� �� ���� ����) while���� ���� ������ �Է��� ���� ��� ���.
		boolean run = true;		
		while (run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("-----------------------------------------------------");			
			
			System.out.println("���� > ");			
			int sum = 0 ;
			double avg = 0;
			int menu = s.nextInt();			
			switch(menu) {
			
			case 1 :	
				System.out.println("�л����� �Է��ϼ���");
				int count=s.nextInt();
				scores = new int[count];
				System.out.println("�л��� : " + count);
				break;
			
			case 2 :
				for(int i = 0; i<=scores.length-1; i++) {
					System.out.println( "���� [" + (i+1) +"��°" + "] >");
					scores[i]=s.nextInt();					
				}
				System.out.println("���� �Է� �Ϸ�" );				
				break;
			
			case 3 :	
				for(int i = 0; i<=scores.length-1; i++) {
					System.out.println((i +1)+ "��° �л��� ���� : " + scores[i]);}
				break;
			
			case 4 :	
				for(int i = 0; i<=scores.length-1; i++) {
					sum = sum + scores[i];
					avg = (double)sum/scores.length;
					if(scores[i]>max) {
						max=scores[i];
					if(scores[i]<min) {
						min=scores[i];
					}
					}
				}
				System.out.println("�� �л� ������ ��� : " + avg);	
				System.out.println("�� �л� �� �ְ� ���� : " +  max);
				System.out.println("�� �л� �� �ּ� ���� : " +  min);
				break;
			
			case 5 :
				run = false ;
				System.out.println("���α׷� ����");
			}
		}
		
		
	}

}