package ex02;
//public , private => ����������
public class Car {
	//�ʵ�(�Ӽ�)
	private String company; //�⺻������ ���� �ʵ尪�� ������ �� ���� ������ private �ְ� set, get method�� �Է� ����� �Ѵ�.
	private int maxSpeed;
	
	//set()�޼ҵ�
	public void setCompany(String company) {
		this.company=company;
	}
	public void setMaxspeed(int maxSpeed) {
		if(maxSpeed < 0) { //setMaxspeed ���� if���� ������ �޾��� �� 0���� �������� �����Ѵ�.
			this.maxSpeed=0;
		}else {
		this.maxSpeed=maxSpeed;
		}
	}
	//get()�޼ҵ�
	public String getCompany() {
		return company;
	}
	public int getmaxSpeed(){
		return maxSpeed;
	}
	
	//������
	Car(){
		
	}
	
	//�޼ҵ�
	void printCar() {
		System.out.println("������ : " + company);
		System.out.println("�ִ�ӵ� : " + maxSpeed + "Km");
	}
}	