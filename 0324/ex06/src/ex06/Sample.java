package ex06;

public class Sample {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while(i<100) {
			i=i+1; // i���� 1�� ������Ų��.
			sum = sum + i; // i���� sum�� ������Ų�� (sum+=i)			
		}
		System.out.println(sum);		
		//0~100 ¦���հ�
		sum=0;
		i=0;
		while(i<100) {

			i=i+2; // i���� 1�� ������Ų��.
			sum = sum + i; // i���� sum�� ������Ų�� (sum+=i)			
		}
		System.out.println(sum);
	
		//1~99 Ȧ���հ�
		
		i=-1;
		sum=0;
		while(i<99) {
			i=i+2; // i���� 1�� ������Ų��.
			sum = sum + i; // i���� sum�� ������Ų�� (sum+=i)		
			

		}
		System.out.println(sum);
	}

}