package ex02;

public class Sample {

	public static void main(String[] args) {
		
			String name = "ȫ�浿";
			int kor = 90, eng=90, mat=90;
			double tot=kor+eng+mat;
			double avg=tot/3;
			String grade = "";
			
			if(avg>=90) {
				if(avg >=95) {
					grade="A+";
				}else {
					grade="A0";
				}
			}else if(avg>=80) {
				if(avg>=85) {
					grade="B+";
				}else {
					grade="B0";
				}
			}else if (avg>=70) {
				if(avg>=65) {
					grade = "C+";}
				else {
					grade = "C0";
			}
			
	
			}
			//����ǥ ���
			System.out.println("�̸� : " + name);
			System.out.println("���� : " +kor);
			System.out.println("���� : " +eng);
			System.out.println("���� : " +mat);
			System.out.println("���� : " +tot);
			System.out.println("��� : " +avg);
			System.out.println("��� :  " + grade);
			
			
			String name1 = "�����";
			int price = 100;
			int number = 5;
			int total = (price*number) ;
			String grade1 ="";
			
			if(total >=1000) 
			   {grade= "�ֿ��";}
				
				else if(total >=500) 
							{grade ="���";}
			
				else{grade ="����";}
			
			System.out.println("��ǰ�� : " + name );
			System.out.println("�ܰ� :" + price + "����");
			System.out.println("�Ǹŷ� :" + number + "��");
			System.out.println("�� �Ǹŷ� :" + (price*number) + "����");
			System.out.println("����� �Ǹž��� " + total + "���� �Դϴ�. \n");
			System.out.println("�׷��Ƿ� ����� " + grade + "�Դϴ�." );
			
	}

}
