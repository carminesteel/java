package ex05;

import java.util.Scanner;

public class Sample {

	   public static void main(String[] args) {
		  // 반복문 for문
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
		   System.out.print("1:100 합계 2:짝수합계 3:홀수합계");
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
	
	
	   //0~100까지 짝수의 합 출력
	   public static void for3() {
		  System.out.println("****예제3****");
		   
		   
		   int sumeven = 0;
		   for(int e=0; e<=100; e=e+2) {
			  sumeven=sumeven+e;
		   }
		   System.out.println(sumeven);
		   
		   
	   }
	   
	   
	   //0~100까지 홀수의 합 출력
	   public static void for4() {
		  System.out.println("****예제4****");
		   
		   
		   int sumo = 0;
		   for(int o=1; o<=100; o=o+2) {
			  sumo=sumo+o;
		   }
		   System.out.println(sumo);
		   
	   }
	   
	   
	   
	   //1~100까지 합을 출력
		public static void for2() {
			System.out.println("**********예제2**********");
			int sum = 0;
			for (int i=1; i<=100; i++) {
				sum=sum+i;
			}
			System.out.println("1부터 100까지의 합계 = " + sum);
			
		}
	
	//1~5까지 반복출력
		public static void for1() {
			System.out.println("**예제1**");
			for(int i=0; i<=5; i++) { // i= i+2하면 i값에서 2씩 늘어남
				System.out.println(i);
			}
	}

}
