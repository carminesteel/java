package ex01;

public class Sample {

	public static void main(String[] args) {
		//�迭�� �ִ� �����͵鿡 ���� ��հ��� �ִ밪 ���ϱ�
		int sum = 0; 													//�հ踦 ������ų ���� 0
		int max = -99999; 										//�ִ밪 ���Ҷ��� �ſ� ���� ���� ������ ���� (-�� ��� ����)
		int min = 999999;											//�ּҰ� ���Ҷ��� �ſ� ū ���� ������ ����
		int[] num = {96,64,36,46,14,31,45,14};		//�迭�� ���� ��
		
		for(int i=0; i<=num.length-1; i++) { 			// 0���� num.length-1(7)
			sum = sum + num[i];
			if(num[i]>max) {
				max=num[i]; 											//num[i]���� max���� ũ�� max = num[i] �� �ݺ�.
				 																//�ִ밪�� �����ϸ� ������ ����
			}
			if(num[i]<min) {
				min=num[i];
			}
		}
		
		double avg=(double) sum/num.length; 	//num.length�� �������� ����
		System.out.println("��� : " + avg);
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}

}