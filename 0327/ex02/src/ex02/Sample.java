package ex02;

import java.util.Scanner;

public class Sample {

   private static int[] baes;

public static void main(String[] args) {
      Scanner s = new Scanner (System.in);
      boolean run = true;
      int B = 0;
      int[]baes = null;
      int num = 0;
      while(run) {
    	 int sum = 0;
    	 int i = 0;
         System.out.println("=================================");
         System.out.println("1. 배열생성 | 2. 데이터입력 | 3. 데이터출력 | 4. 종료");
         System.out.println("=================================");
         System.out.print("선택 > ");
         int menu = s.nextInt();
         switch(menu) {
	         case 1 :
	        	 System.out.println("배열생성");
	        	 System.out.print("배열을 몇까지 생성?");
	        	 B=s.nextInt();
	        	 baes=new int [B];
	        	 System.out.println("배열이 "+B+"만큼 생성됨");
	        	 num=num+1;
	            break;
	         case 2 :
	            System.out.println("데이터입력");   
	            System.out.println( "데이터를 입력하세요");
	            for(i=0; i<=B-1; i++) {      
	            	System.out.print((i+1)+"번째 데이터 입력 > ");
	            	baes[i] = s.nextInt();
	            } 
	            System.out.print( "데이터 입력완료 ");
	            break;
	         case 3 :
	        	 System.out.println("데이터출력");
	        	 for(i=0; i<=B-1; i++) {
	        		System.out.println((i+1) + "번째 데이터 : " + baes[i]);
	         		sum = sum + baes[i];       		
	        		 };
	         		double avg = 0;
	         		avg = (double)sum/B;
	        		System.out.println("합계 : " + sum);
	        		System.out.println("평균 : " + avg);   	 
	            break;
	         case 4 :
	            System.out.println("프로그램 종료");
	            run = false;
         }
      }
   }
}