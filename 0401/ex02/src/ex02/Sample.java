package ex02;

public class Sample {

	public static void main(String[] args) {
		
		Car c1/* <--객체*/=new Car()/* <--생성자 */;
		//c1.company = "현대";
		//c1.maxSpeed = 200;
		
		c1.setCompany("삼성");
		System.out.println("제조사 : "+c1.getCompany());
		c1.setMaxspeed(-120);
		System.out.println("최대속도 : "+ c1.getmaxSpeed());
		//c1.printCar();
	}

}
