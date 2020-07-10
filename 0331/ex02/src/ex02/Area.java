package ex02;

//넓이를 구하는 Class
public class Area {
	//삼각형 넓이 (밑변 * 높이 * 1/2)
	
	
	static double triangle(int x, int y) { //static 붙이면 객체 생성 안해도 됌.
		System.out.println("삼각형 넓이");
		return x*y/2.;
	}
	
	//직사각형 넓이 (가로 * 세로)
	static int rectangle(int x, int y) {
		System.out.println("직사각형 넓이");
		return x*y;
	}
	//정사각형 넓이
	static int rectangle(int x) { // 변수는 같아도 매개변수가 다름
		System.out.println("정사각형 넓이");
		return x*x;

	}
	//원의 넓이
	static double circle(int r) { // 변수는 같아도 매개변수가 다름
		System.out.println("원의 넓이");
		return r*r*3.14;

	}
}