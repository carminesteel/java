package ex09;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		System.out.println("5개 숫자 합 구하기");
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int[] d = new int[5];
		for(int i=0; i<=d.length-1; i++) {
			System.out.println(i+1 + "번째 값은?>");
			d[i] = s.nextInt();
			sum = sum+d[i];
			
		}
		System.out.println("합계 : " + sum );
		System.out.println("평균 : " + sum/(double)d.length);

	}

}
