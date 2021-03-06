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
         System.out.println("1. 성적입력 | 2. 성적목록 | 3. 성적조회 | 4. 종료");
         System.out.println("=================================");
         System.out.print("선택 > ");
         int menu = s.nextInt();
      
         switch(menu) {
         case 1 :
            System.out.println("성적입력");
            System.out.print("번호 > ");
            num[count] = s.nextInt();
            System.out.print("성명 > ");
            name[count] = s.next();
            System.out.println("성적을 입력하세요");
            System.out.print("국어");   
            kor[count] = s.nextInt();
            System.out.print("영어");
            eng[count] = s.nextInt();
            System.out.print("수학");
            mat[count] = s.nextInt();
            System.out.println("국어>"+kor[count]+"\n"+"수학>"+mat[count]+"\n"+"영어>"+eng[count]+"\n");
            System.out.println("결과 : 성적입력완료");      
            count=count+1;
            break;
         case 2 :
            System.out.println("성적목록");   
            System.out.println("번호   이름   국어   영어   수학   평균");
            for(int i=0; i<=count-1; i++) {
               avg[i] = (kor[i]+eng[i]+mat[i])/3.;                     
               System.out.println( num[i]+"\t"+name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+avg[i]);
            }
            
            break;
         case 3 :
            System.out.println("성적조회");   
            System.out.print("번호를 입력하세요 > ");   
            int input = s.nextInt();
            for(int i=0; i<=count; i++){
               if(input==(num[i])){
                  System.out.println("확인되었습니다");  
                  System.out.println("번호>"+num[i]);
                  System.out.println("이름>"+name[i]);
                  System.out.println("국어>"+kor[i]);
                  System.out.println("영어>"+eng[i]);
                  System.out.println("수학>"+mat[i]);
               }else {System.out.println("데이터가 없습니다."); }
            }                        
            break;
         case 4 :
            System.out.println("프로그램 종료");
            run = false;
         }
      }

   }

}