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
		System.out.println("현재속도 입력");
		speed = s.nextInt();
	
		while(run) {				

			System.out.println("-------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3.중지 | 4.속도확인");
			System.out.println("-------------------------");
			
			int menu = s.nextInt();
		
			switch (menu) {
			case 1 :


				System.out.print("선택 1 : \n");

				speed = speed +1;
				System.out.print("현재 속도 = " + (speed) + "\n");
				break;
				
			case 2 : 
				System.out.println("현재속도 입력");
				System.out.print("선택 2 : \n");
			
				speed = speed -1;
				System.out.print("현재 속도 = " + (speed) + "\n");
				break;	
				
			case 3 : 
				System.out.print("선택 3 : \n");
				System.out.print("프로그램 종료 \n");
				run = false;
				break;
				
			case 4 : 
				System.out.println("현재 속도는 " + speed + "입니다." );
				break;
			default : 
				System.out.println("잘못된 값");
			}
	
		}
	}		
}


