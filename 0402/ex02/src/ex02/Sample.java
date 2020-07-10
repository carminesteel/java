package ex02;
//상속!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class Sample {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.r=5;
		double area=c1.areaCircle();
		System.out.println("원의 넓이 : "+area);
		
		Computer c2 = new Computer();
		c2.r=5;
		System.out.println("더 정확한 원의 넓이 :"+c2.areaCircle());
		
	}

}
