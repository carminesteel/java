package ex02;

//���̸� ���ϴ� Class
public class Area {
	//�ﰢ�� ���� (�غ� * ���� * 1/2)
	
	
	static double triangle(int x, int y) { //static ���̸� ��ü ���� ���ص� ��.
		System.out.println("�ﰢ�� ����");
		return x*y/2.;
	}
	
	//���簢�� ���� (���� * ����)
	static int rectangle(int x, int y) {
		System.out.println("���簢�� ����");
		return x*y;
	}
	//���簢�� ����
	static int rectangle(int x) { // ������ ���Ƶ� �Ű������� �ٸ�
		System.out.println("���簢�� ����");
		return x*x;

	}
	//���� ����
	static double circle(int r) { // ������ ���Ƶ� �Ű������� �ٸ�
		System.out.println("���� ����");
		return r*r*3.14;

	}
}