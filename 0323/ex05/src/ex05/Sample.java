package ex05;

public class Sample {

	public static void main(String[] args) {
		
		//������
		//1)���������
		//2)���迬����
		//3)����������
		//4)���׿�����
		//5)���׿�����
		//6)���Կ�����
		
		//���������
		int num1 = 10;
		int num2 = 5;
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4 = num1 / num2;
		int result5 = num1 % num2;
		//+, -, *, /, % ������ ���
		System.out.println(num1 + "+" + num2 + "=" + result1);
		System.out.println(num1 + "-" + num2 + "=" + result2);
		System.out.println(num1 + "*" + num2 + "=" + result3);
		System.out.println(num1 + "/" + num2 + "=" + result4);
		System.out.println(num1 + "%" + num2 + "=" + result5);
		
		double numA = 147.8;
		double numB = 142.1;
		double resultX = (numA*numB)/3.5;
		System.out.println(resultX);

		double resultY = (resultX * numA)/1.2;
		System.out.println(resultY);
		
		//���迬����
		boolean result6=(num1==num2);
		System.out.println(num1 + "==" + num2 + ":" + result6);
		//num1�� ���� num2�� ���� ���� �����Ƿ�
		//����� false
		result6 = (num1 > num2);
		System.out.println(num1 + ">" + num2 + ":" + result6);
		result6 = (num1 < num2);
		System.out.println(num1 + "<" + num2 + ":" + result6);
		result6 = (num1 <= num2);
		System.out.println(num1 + "<=" + num2 + ":" + result6);
		result6 = (num1 >= num2);
		System.out.println(num1 + ">=" + num2 + ":" + result6);
		result6 = (num1 != num2);
		System.out.println(num1 + "!=" + num2 + ":" + result6);
		
		
		//���������� (and  &&  , or || , not ! )
		result6 = (num1>10)  || (num2<6); //�Ǵ� or ((�����ϳ��� ���̾/ �����̾))
		System.out.println("------------------");
		System.out.println(result6);
		
		result6 = (num1>10)  && (num2<6); //�׸��� and ((�Ѵ� ��/�����ϰ��))
		System.out.println(result6);
		
		// !�� not (����� �ݴ�)
		
		
		//if ����
		int age = 23;
		char gender = 'M';
		//20�� �̻� ���ڸ� ���尡�� �ƴϸ� �Ұ��� ���
		if((age>=20) && (gender == 'M')) {
		System.out.println("���尡��");}else {System.out.println("����Ұ���");
		}
		
		int kor=90, eng=60;
		//����, ���� ������ ���� 70�� �̻� ����� 70�̻��̸� �հ�
		double avg=(double)(kor+eng)/2;
		if(kor>=70 && eng>=70 && avg >=70) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");
		}
		
		if(kor>=70 && eng>=70 && ((kor+eng)/2)>=70) {
			System.out.println("�հ�");
		} else {System.out.println("���հ�");
		}
		
		if((kor>=70 && eng>=70)&&((kor+eng)/2)>=70) {
			System.out.println("�հ�");
		} else {System.out.println("���հ�");
		
		if((kor>=70 || eng>=70)||((kor+eng)/2)>=70) {
			System.out.println("�հ�");
		} else {System.out.println("���հ�");}
		
		//���׿�����
		int grade = 65;
		if(grade <70) {System.out.println("���հ�");}
		else {System.out.println("�հ�");}
		
		//���� ���� if ������ ���׿����ڷ� ?�� �̿��� �ۼ�����.
		//���ǽ��� �����ϸ� ����, �Ҹ����� ���ڷ� ǥ��.
		String result=(grade<70) ? "���հ�":"�հ�";
		System.out.println(result);
		
		
		//���׿����� ++, -- �� ������ ���ϰų� ��.
		System.out.println(--grade);
		
		//���Կ�����
		grade = 60;
		System.out.println(grade);
		grade+=2;  //grade ������ 2��ŭ ������  // grade = grade + 2;
		System.out.println(grade);
		grade=grade+2;
		System.out.println(grade);
		grade+=2;
		System.out.println(grade);
		}
		
		int A=5;
		A*=2.7;
		System.out.println(A);
	}

}