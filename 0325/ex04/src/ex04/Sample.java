package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {			
			boolean run = true;
			while(run) {
				System.out.println("���ڸ� �Է��Ͻÿ�");
				Scanner s = new Scanner(System.in);
				int N = s.nextInt();
				//N�� ������ N*1~N*9���� �� ����
				
				if(N>=1 && N<=9) {
						for(int i = 1; i<=9; i++) {
							int sum = N*i;
							System.out.println(sum);
						}
						}else {
						run=false;	
						System.out.println("������x");
						}
			}
	}

}