package ex04;

import java.util.Scanner;

public class Sample {
//main------------------------
	public static void main(String[] args) {
		
		//switch1();
		//score();
		score2();
	}
//score----------------------
	public static void score() {
		System.out.println("*********�������**********");
		Scanner scanner=new Scanner(System.in);
		System.out.print("����>");
		int kor = scanner.nextInt();
		System.out.print("����>");
		int mat = scanner.nextInt();
		System.out.print("����>");
		int eng = scanner.nextInt();
		
		int tot = kor+ mat+ eng;
		int avg = tot/3;
		
		System.out.println("�� ������ ����� " + avg);
	
		System.out.println("�� ������ ���� " + tot );
	}
	
	//switch----------------------
	public static void switch1() {
		System.out.println("switch ����1");
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ð��Է�");
		int time = scanner.nextInt(); //Ű���忡�� ������ �Է��� �ޱ� ���� Scanner Ŭ������ ����
		
		switch(time) {
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
			break;
		case 8 :
			System.out.println("����� �մϴ�");
			break;
		case 10 :
			System.out.println("������ �մϴ�");
			break;
		default:
			System.out.println("�ܱ��� �մϴ�");
		}
	}
		
		public static void score2() {
			System.out.println("*********�������**********");
			Scanner s=new Scanner(System.in);
			System.out.print("����");
			int score = s.nextInt();
			if(score>=90) {
				System.out.println("������A");
			}else if(score>=80) {
				System.out.println("������B");

			}
			
			
			
	}
	
}
