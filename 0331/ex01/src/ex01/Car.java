package ex01;

public class Car {
	
	Car(){
		
	}
	

	String company ="����";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model, String color, int maxSpeed){ //�Ϲݻ����� / ������ ���� �̸� �������ش�
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
	
	//��¸޼ҵ�(����)
	void printCar(Car c) {
		System.out.println("------�ڵ��� ����------");
		System.out.println("ȸ��:" + c.company);
		System.out.println("��:" + c.model);
		System.out.println("����:" + c.color);
		System.out.println("�ִ�ӵ�:" + c.maxSpeed);
		
	}
}