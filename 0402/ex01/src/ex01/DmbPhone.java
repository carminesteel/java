package ex01;

public class DmbPhone extends Phone {
	//�ʵ�
	int channel;
	
	//�Ϲݻ�����
	DmbPhone(String model, String color, int Channel){
		this.model=model;
		this.color=color;
		this.channel=channel;		
	}
	//�޼ҵ�
	void turnonDmb() {
		System.out.println(channel+"�� DMB ����� �����մϴ�.");
	}
	void changeChannel(int channel){
		System.out.println(channel+"������ �ٲߴϴ�");
							
	}
	void turnOffDmb() {
		System.out.println("Dmb ����� �����մϴ�.");
	}
}

