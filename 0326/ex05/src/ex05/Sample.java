package ex05;

import java.util.Scanner;

public class Sample {

   public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      boolean run = true;
      int count = 0;
      String[] acc = new String[100];
      String[] name = new String[100];
      int[] money = new  int[100];
      
      
      while (run) {
         System.out.println("---------------------------------------------");
         System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.����");
         System.out.println("---------------------------------------------");   
         System.out.print("���ɾ� ���� > ");   
         int menu = s.nextInt();
         switch(menu) {
         case 1 :
            System.out.println("--------------------------------------------");
            System.out.println("���»���");
            System.out.println("--------------------------------------------");
            System.out.println("���¹�ȣ" );
            acc[count] = s.next();
            System.out.println("������"  );
            name[count] = s.next();
            System.out.println("�ʱ��Աݾ�"  );
            money[count] = s.nextInt();
            System.out.println("��� : ���°� �����Ǿ����ϴ�." );
            count=count+1; 
            break;
         case 2 :
            System.out.println("--------------------------------------------");
            System.out.println("���¸��");
            System.out.println("--------------------------------------------");
            for(int i=0;i<=count-1; i++) {
               System.out.println(i+1 + "."+ " \t " +acc[i] + " \t " +name[i] + " \t " +money[i]);
            }
      
            break;
         case 3 :
            System.out.println("--------------------------------------------");
            System.out.println("����");
            System.out.println("���¹�ȣ�� �Է��ϼ���");
            
            String acct=s.next(); /* �Է��� ���¹�ȣ */      
            
            boolean find = false; /*find �⺻�� = false */
            
            for(int i=0; i<=count-1; i++) {
               if(acct.equals(acc[i])) {
               System.out.println("���� ����, �Ա� �ݾ��� �Է��ϼ���");
               System.out.print("�Ա��� �ݾ� >");
               int save = s.nextInt();
               money[i] = money[i] + save;
               find = true;
               }
            }
            
            if(find) {
            System.out.println("���� �Ա� ����");
            }else{
            System.out.println("���°� �����ϴ�");
            }                     
            
            break;
         case 4 :
            System.out.println("--------------------------------------------");
            System.out.println("���");
            System.out.println("���¹�ȣ�� �Է��ϼ���");
            System.out.print("�Է� > ");
            String acct2=s.next();   
            
            
            boolean find2 = false;
            
            for(int i=0; i<=count-1; i++) {
               if(acct2.equals(acc[i])) {
               System.out.println("���� ����, ��� �ݾ��� �Է��ϼ���");
               int save = s.nextInt();
               money[i] = money[i] - save;
               find = true;
               }
            }
            if(find2){
            System.out.println("��ݼ���");
            }else{
            System.out.println("���°� �����ϴ�");
            }               
                        
            run=false;
         }
      }
      
      
   }

}