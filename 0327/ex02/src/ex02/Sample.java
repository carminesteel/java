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
         System.out.println("1. �迭���� | 2. �������Է� | 3. ��������� | 4. ����");
         System.out.println("=================================");
         System.out.print("���� > ");
         int menu = s.nextInt();
         switch(menu) {
	         case 1 :
	        	 System.out.println("�迭����");
	        	 System.out.print("�迭�� ����� ����?");
	        	 B=s.nextInt();
	        	 baes=new int [B];
	        	 System.out.println("�迭�� "+B+"��ŭ ������");
	        	 num=num+1;
	            break;
	         case 2 :
	            System.out.println("�������Է�");   
	            System.out.println( "�����͸� �Է��ϼ���");
	            for(i=0; i<=B-1; i++) {      
	            	System.out.print((i+1)+"��° ������ �Է� > ");
	            	baes[i] = s.nextInt();
	            } 
	            System.out.print( "������ �Է¿Ϸ� ");
	            break;
	         case 3 :
	        	 System.out.println("���������");
	        	 for(i=0; i<=B-1; i++) {
	        		System.out.println((i+1) + "��° ������ : " + baes[i]);
	         		sum = sum + baes[i];       		
	        		 };
	         		double avg = 0;
	         		avg = (double)sum/B;
	        		System.out.println("�հ� : " + sum);
	        		System.out.println("��� : " + avg);   	 
	            break;
	         case 4 :
	            System.out.println("���α׷� ����");
	            run = false;
         }
      }
   }
}