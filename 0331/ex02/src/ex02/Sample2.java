package ex02;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		//cal();
		//Area a1=new Area();
		System.out.println(Area.triangle(5, 5)); //static ���̸� ��ü ���� ���ص� ��.
		System.out.println(Area.rectangle(5, 7));
		System.out.println(Area.rectangle(5)); //������ ���Ƶ� �Ű������� �ٸ� -> �����ε�
		System.out.println(Area.circle(5)); //������ ���Ƶ� �Ű������� �ٸ� -> �����ε�
	}
	
	public static void cal() {
		Scanner s=new Scanner(System.in);
		System.out.print("x= ");
		int x=s.nextInt();
		System.out.print("y= ");
		int y=s.nextInt();
		
		Calculator c1=new Calculator(x, y);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("x+y = " + c1.plus(x, y));
		System.out.println("x-y = " + c1.minus(x, y));
		
		double result = c1.divide(x,y);
		System.out.println("x/y = " + result);
		result = c1.multiply(x,y);
		System.out.println("x*y = " + result);
	
		c1.powerOn();
	}

}
