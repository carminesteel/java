package ex01;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	      
		 int[] number=null;					//�迭����
	      
	      System.out.print("�迭ũ��>");		
	      int count=s.nextInt();			//�迭ũ�⸦ Ű���忡�� �Է�
	      number = new int[count];			//�迭����
	      
	      int sum=0;						//�հ� ���� �ʱ�ȭ
	      for(int j=0; j<count; j++) {
	         System.out.print(j+1+ "��°��[" + (j+1) + "]>");
	         number[j]=s.nextInt();
	         sum=sum+number[j];
	      }
	      System.out.println("�հ�=" + sum);

	}

}