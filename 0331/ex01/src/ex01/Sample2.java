package ex01;

public class Sample2 {
	public static void main(String[] args) {
		//students();
		cars();
	}
	
	
	public static void cars() {
		
	
	Car car1 = new Car();
	car1.color="����";
	car1.model="�׷���";
	car1.maxSpeed=250;
	car1.printCar(car1);
	
	Car car2 = new Car();
	car2.color="����";
	car2.model="����ī";
	car2.maxSpeed=15;
	car2.printCar(car2);
	
	Car car3 = new Car();
	car3.color="����";
	car3.model="������";
	car3.maxSpeed=35;
	car3.printCar(car3);
	
	Car car4 = new Car("Ƽ��","���",250);
	car4.printCar(car4);
	
	}
	
	public static void students() {
		
	Student s1 = new Student();
	s1.sno="01";
	s1.sname="ȫ�浿";
	s1.tel="010-9646-9022";
	s1.print(s1);
	
	
	Student s2 = new Student();
	s2.sno="02";
	s2.sname="��û��";
	s2.tel="010-9646-9025";
	s2.print(s2);
	
	Student s3 = new Student("03","������","010-0001-0001");
	s3.print(s3);;
	
	}
}