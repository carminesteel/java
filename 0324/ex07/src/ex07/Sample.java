package ex07;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		System.out.println("100 : 1~100������ �հ� 10 : 1~10������ �հ� 0 : ���α׷� ����");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		switch(number) {
		case 100 : 
					int sum=0;
				    int i=0;
				    while(i<100) {		
					i=i+1; 
					sum = sum + i; 	
				}
				System.out.println(sum);
		break;
		
			case 10 :{ 
				sum=0;
			    i=0;
			    while(i<10) {
			    			i=i+1; sum = sum + i; 	
			}
			System.out.println(sum);
			};
			break;
			case 0 :{System.out.println("���α׷� ����"); 
			};
			}
		
		

		
		}

}