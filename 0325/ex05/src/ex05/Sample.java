package ex05;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		//�迭(����Ÿ��)
		/*int[] d= {90, 80, 100, 88, 100};
		int sum=0;
		
			for(int i=0; i<=d.length-1; i++) {
				System.out.println(i + "��° : " + d[i]);
				sum = sum + d[i];
				}
			
					System.out.println("�հ� : " + sum);
					System.out.println("��� : " + sum/(double)d.length );*/
		

		
		Scanner s = new Scanner(System.in);
		int[] num=new int[5];
		int sum=0;
			for(int i=0; i<=num.length-1; i++) {
				System.out.println(i + "��°��? ");
				num[i]=s.nextInt();
				sum=sum+num[i];
			}
			System.out.println("�հ�: " + sum);
		

	}

}