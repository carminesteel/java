package ex05;

import java.util.Scanner;

public class Sample {

	   public static void main(String[] args) {
		  // �ݺ��� for��
		   // i++
		   // i+=1
		   // i=i+1
	
		   // i+=2
		   // i=i+2		   

		   // i+=3
		   // i=i+3
		   
		//for1(); 
		//for2(); 
		//for3();
		//for4();
		   System.out.print("1:100 �հ� 2:¦���հ� 3:Ȧ���հ�");
		   Scanner s = new Scanner(System.in);
		   int number = s.nextInt();
		   switch(number) {
		   case 1 : 
			   for2();
			   break;
		   case 2 : 
			   for3();
			   break;
		   case 3 : 
			   for4();
			  
		   }
			   
		
	}
	
	
	   //0~100���� ¦���� �� ���
	   public static void for3() {
		  System.out.println("****����3****");
		   
		   
		   int sumeven = 0;
		   for(int e=0; e<=100; e=e+2) {
			  sumeven=sumeven+e;
		   }
		   System.out.println(sumeven);
		   
		   
	   }
	   
	   
	   //0~100���� Ȧ���� �� ���
	   public static void for4() {
		  System.out.println("****����4****");
		   
		   
		   int sumo = 0;
		   for(int o=1; o<=100; o=o+2) {
			  sumo=sumo+o;
		   }
		   System.out.println(sumo);
		   
	   }
	   
	   
	   
	   //1~100���� ���� ���
		public static void for2() {
			System.out.println("**********����2**********");
			int sum = 0;
			for (int i=1; i<=100; i++) {
				sum=sum+i;
			}
			System.out.println("1���� 100������ �հ� = " + sum);
			
		}
	
	//1~5���� �ݺ����
		public static void for1() {
			System.out.println("**����1**");
			for(int i=0; i<=5; i++) { // i= i+2�ϸ� i������ 2�� �þ
				System.out.println(i);
			}
	}

}