package ex07;

public class Sample {

	public static void main(String[] args) {
		System.out.println("*****���⺸����*****");
		System.out.println("----------------------------");
		System.out.println("��ǰ��\t ����\t �ܰ�\t �ݾ�\t ���");
		System.out.println("----------------------------");
		String[] name = {
				"�����","��Ź��","������"
				};
		int sumprice = 0;
		int[] amount = {
				2,3,5
				};
		int[] price = {
				300,100,150
				};
		int[] sum = new int[3];
		String[] mark = new String[3]; 
			for(int i=0; i<=2; i++) {
				sum[i]=amount[i]*price[i];
				if(sum[i]>=700){mark[i]="�ֿ��";}
				else if (sum[i]>=500) {mark[i]="���";}
				else {mark[i]="����";}
				System.out.println(name[i]+ "\t"  + amount[i]+ "\t" + price[i]+ "\t" + sum[i]+ "\t" + mark[i]);				
				sumprice = sumprice + sum[i];
				}
				
					
		System.out.println("----------------------------");
		System.out.println("�����հ�" + "\t" + "\t" +sumprice);
		
	}

}