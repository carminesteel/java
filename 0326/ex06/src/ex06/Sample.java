package ex06;

import java.util.Scanner;

public class Sample {

   public static void main(String[] args) {
      Scanner s = new Scanner (System.in);
      boolean run = true;
      int count = 0;
      int[] num = new int [100];
      String[] name = new String [100];
      int[] kor = new int [100];
      int[] eng = new int [100];
      int[] mat = new int [100];
      double[] avg = new double [100];
      
      while(run) {
         System.out.println("=================================");
         System.out.println("1. �����Է� | 2. ������� | 3. ������ȸ | 4. ����");
         System.out.println("=================================");
         System.out.print("���� > ");
         int menu = s.nextInt();
      
         switch(menu) {
         case 1 :
            System.out.println("�����Է�");
            System.out.print("��ȣ > ");
            num[count] = s.nextInt();
            System.out.print("���� > ");
            name[count] = s.next();
            System.out.println("������ �Է��ϼ���");
            System.out.print("����");   
            kor[count] = s.nextInt();
            System.out.print("����");
            eng[count] = s.nextInt();
            System.out.print("����");
            mat[count] = s.nextInt();
            System.out.println("����>"+kor[count]+"\n"+"����>"+mat[count]+"\n"+"����>"+eng[count]+"\n");
            System.out.println("��� : �����Է¿Ϸ�");      
            count=count+1;
            break;
         case 2 :
            System.out.println("�������");   
            System.out.println("��ȣ   �̸�   ����   ����   ����   ���");
            for(int i=0; i<=count-1; i++) {
               avg[i] = (kor[i]+eng[i]+mat[i])/3.;                     
               System.out.println( num[i]+"\t"+name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+avg[i]);
            }
            
            break;
         case 3 :
            System.out.println("������ȸ");   
            System.out.print("��ȣ�� �Է��ϼ��� > ");   
            int input = s.nextInt();
            for(int i=0; i<=count; i++){
               if(input==(num[i])){
                  System.out.println("Ȯ�εǾ����ϴ�");  
                  System.out.println("��ȣ>"+num[i]);
                  System.out.println("�̸�>"+name[i]);
                  System.out.println("����>"+kor[i]);
                  System.out.println("����>"+eng[i]);
                  System.out.println("����>"+mat[i]);
               }else {System.out.println("�����Ͱ� �����ϴ�."); }
            }                        
            break;
         case 4 :
            System.out.println("���α׷� ����");
            run = false;
         }
      }

   }

}