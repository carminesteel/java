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
         System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
         System.out.println("---------------------------------------------");   
         System.out.print("명령어 선택 > ");   
         int menu = s.nextInt();
         switch(menu) {
         case 1 :
            System.out.println("--------------------------------------------");
            System.out.println("계좌생성");
            System.out.println("--------------------------------------------");
            System.out.println("계좌번호" );
            acc[count] = s.next();
            System.out.println("계좌주"  );
            name[count] = s.next();
            System.out.println("초기입금액"  );
            money[count] = s.nextInt();
            System.out.println("결과 : 계좌가 생성되었습니다." );
            count=count+1; 
            break;
         case 2 :
            System.out.println("--------------------------------------------");
            System.out.println("계좌목록");
            System.out.println("--------------------------------------------");
            for(int i=0;i<=count-1; i++) {
               System.out.println(i+1 + "."+ " \t " +acc[i] + " \t " +name[i] + " \t " +money[i]);
            }
      
            break;
         case 3 :
            System.out.println("--------------------------------------------");
            System.out.println("예금");
            System.out.println("계좌번호를 입력하세요");
            
            String acct=s.next(); /* 입력할 계좌번호 */      
            
            boolean find = false; /*find 기본값 = false */
            
            for(int i=0; i<=count-1; i++) {
               if(acct.equals(acc[i])) {
               System.out.println("계좌 존재, 입금 금액을 입력하세요");
               System.out.print("입금할 금액 >");
               int save = s.nextInt();
               money[i] = money[i] + save;
               find = true;
               }
            }
            
            if(find) {
            System.out.println("예금 입금 성공");
            }else{
            System.out.println("계좌가 없습니다");
            }                     
            
            break;
         case 4 :
            System.out.println("--------------------------------------------");
            System.out.println("출금");
            System.out.println("계좌번호를 입력하세요");
            System.out.print("입력 > ");
            String acct2=s.next();   
            
            
            boolean find2 = false;
            
            for(int i=0; i<=count-1; i++) {
               if(acct2.equals(acc[i])) {
               System.out.println("계좌 존재, 출금 금액을 입력하세요");
               int save = s.nextInt();
               money[i] = money[i] - save;
               find = true;
               }
            }
            if(find2){
            System.out.println("출금성공");
            }else{
            System.out.println("계좌가 없습니다");
            }               
                        
            run=false;
         }
      }
      
      
   }

}