package ex01;

public class Car {
	
	Car(){
		
	}
	

	String company ="현대";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model, String color, int maxSpeed){ //일반생성자 / 각각의 값을 미리 지정해준다
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
	
	//출력메소드(동작)
	void printCar(Car c) {
		System.out.println("------자동차 정보------");
		System.out.println("회사:" + c.company);
		System.out.println("모델:" + c.model);
		System.out.println("색상:" + c.color);
		System.out.println("최대속도:" + c.maxSpeed);
		
	}
}
