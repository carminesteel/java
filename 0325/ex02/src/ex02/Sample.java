package ex02;

import java.util.Scanner;

public class Sample {
	
	public static void method1() {
		int sum = 0;
		for(int i=0; i<=100; i=i+1)
			{sum = sum+i;}
		System.out.println("1~100 까지의 합계 : " + sum);
	}
	
	public static void method2() {
		int sum = 0;
		for(int i=0; i<=100; i=i+2)
			{sum = sum+i;}
		System.out.println("1~100 까지의 짝수합계 : " + sum);
	}

	public static void method3() {
		int sum = 0;
		for(int i=-1; i<=100; i=i+2)
			{sum = sum+i;}
		System.out.println("1~100 까지의 홀수합계 : " + sum);
	}

	
	
	public static void main(String[] args) {
		boolean run = true;
			while(run) {
				System.out.println("[1]1~100까지의 합계");
				System.out.println("[2]1~100까지의 짝수합계");	
				System.out.println("[3]1~100까지의 홀수합계");
				System.out.println("[4]프로그램 종료");
				System.out.println("메뉴선택 [1~4]? \n");
				Scanner s = new Scanner(System.in);
				
				
				int menu = s.nextInt();
				
				switch(menu) {
				case 1: 
					System.out.println("\n***1~100까지의 합계 : ");
					method1();
						break;
				case 2 : 		
					System.out.println("\n***1~100까지의 짝수합계 : ");
					method2();	
						break;
				case 3 : 
					System.out.println("\n***1~100까지의 홀수합계 : ");
					method3();
						break;
				case 4 :
					System.out.println("\n***프로그램 종료 : ");
					run = false;
					break;
				default :
					System.out.println("\n잘못 입력했습니다.");
				}
		}
					
		
		
		
	}

}
