package ex01;

import Hyundai.*;
import hankook.*;
import Kumho.*;		//Kumho.Tire 도 가능 *는 모든것

public class Sample {

	public static void main(String[] args) {
		SnowTire st = new SnowTire();
		hankook.Tire t = new hankook.Tire(); //한국일반타이어
		Kumho.Tire t1  = new Kumho.Tire();	//금호 일반타이어 //클래스 이름이 같아서 앞에 패키지 이름까지 붙임.
		Engine e = new Engine();
		BigWidthTire bt = new BigWidthTire();
		
	}

}

