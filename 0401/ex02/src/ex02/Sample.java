package ex02;

public class Sample {

	public static void main(String[] args) {
		
		Car c1/* <--��ü*/=new Car()/* <--������ */;
		//c1.company = "����";
		//c1.maxSpeed = 200;
		
		c1.setCompany("�Ｚ");
		System.out.println("������ : "+c1.getCompany());
		c1.setMaxspeed(-120);
		System.out.println("�ִ�ӵ� : "+ c1.getmaxSpeed());
		//c1.printCar();
	}

}