package ex01;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	      
		 int[] number=null;					//배열선언
	      
	      System.out.print("배열크기>");		
	      int count=s.nextInt();			//배열크기를 키보드에서 입력
	      number = new int[count];			//배열생성
	      
	      int sum=0;						//합계 변수 초기화
	      for(int j=0; j<count; j++) {
	         System.out.print(j+1+ "번째값[" + (j+1) + "]>");
	         number[j]=s.nextInt();
	         sum=sum+number[j];
	      }
	      System.out.println("합계=" + sum);

	}

}
