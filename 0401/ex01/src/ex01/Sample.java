package ex01;

import Hyundai.*;
import hankook.*;
import Kumho.*;		//Kumho.Tire �� ���� *�� ����

public class Sample {

	public static void main(String[] args) {
		SnowTire st = new SnowTire();
		hankook.Tire t = new hankook.Tire(); //�ѱ��Ϲ�Ÿ�̾�
		Kumho.Tire t1  = new Kumho.Tire();	//��ȣ �Ϲ�Ÿ�̾� //Ŭ���� �̸��� ���Ƽ� �տ� ��Ű�� �̸����� ����.
		Engine e = new Engine();
		BigWidthTire bt = new BigWidthTire();
		
	}

}

