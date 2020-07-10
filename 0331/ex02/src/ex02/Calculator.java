package ex02;


//계산기 Class
public class Calculator {
	//필드
	int x;
	int y;
		
	//기본생성자(객체를 생성하는 생성자)
	Calculator(){ //클래스 이름이랑 똑같게 만들어야 함
		
	}
	
	//일반생성자
	Calculator(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	//메소드(동작)
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	
	//빼기 메소드
	int minus(int x, int y) {
		int result =x-y;
		return result;
	}	
	
	//나누기 메소드
	double divide(int x, int y) {
		double result = (double)x/y;
		return result;
	}
	//곱하기 메소드
	double multiply(int x, int y) {
		double result = (double)x*y;
		return result;
	}	
	void powerOn() { //리턴타입 없는 경우 void
		System.out.println("전원을 켭니");
	}


}



