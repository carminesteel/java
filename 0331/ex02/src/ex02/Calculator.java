package ex02;


//���� Class
public class Calculator {
	//�ʵ�
	int x;
	int y;
		
	//�⺻������(��ü�� �����ϴ� ������)
	Calculator(){ //Ŭ���� �̸��̶� �Ȱ��� ������ ��
		
	}
	
	//�Ϲݻ�����
	Calculator(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	//�޼ҵ�(����)
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	
	//���� �޼ҵ�
	int minus(int x, int y) {
		int result =x-y;
		return result;
	}	
	
	//������ �޼ҵ�
	double divide(int x, int y) {
		double result = (double)x/y;
		return result;
	}
	//���ϱ� �޼ҵ�
	double multiply(int x, int y) {
		double result = (double)x*y;
		return result;
	}	
	void powerOn() { //����Ÿ�� ���� ��� void
		System.out.println("������ �մ�");
	}


}



