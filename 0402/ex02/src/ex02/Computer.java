package ex02;

public class Computer extends Calculator {

	@Override //상속받은 메소드를 재정의
	double areaCircle() {
		return r*r*3.14159;
	}
	
}
