package ex01;

public class Sample {

	public static void main(String[] args) {
				int score = 88 ; //���� if �� if if �� if else
				
				System.out.println("������" + score + "�Դϴ�. \n"); 
				if( score>=90 ) {System.out.println("����� A�Դϴ�."); //else if��
				}else if(score>=80){
					
					System.out.println("����� B�Դϴ�."); // \n�� ���̸� ���� �� ��� �� �ִ�.
				}else if(score>=70) {
					
					System.out.println("����� C�Դϴ�");
				}else {System.out.println("����� F�Դϴ�");
				} 
				
				//����� ������ 100���� �ֿ��, 50���� ���, 30�̸� ���� ���
				int sale = 70; //���� if��
				if(sale >= 100) {System.out.println("�ֿ��");
				
				}else if (sale >=50) {System.out.println("���");
				
				}else {System.out.println("����");
					
				}
				
				//��ø if��
				//if �ȿ� else if �ȿ� else
		
				int score = 63;
				String grade="";
				
				if(score >= 90) {
						if(score >=95) {grade="A+";
						}else {grade="A0";}
						
				}else if(score >=80) {
						if(score >=85) {grade = "B+";
						}else {grade = "B0";}
						
				}else if(score >=70) {
						if(score >=75) {grade = "C+";
						}else {grade = "C0";}
						
				}else if(score >=60) {
						if(score >=65) {grade = "D+";
						}else {grade = "D0";}
						}
				
				else {grade = "F";
						}
				
				System.out.println("�����" + grade + "�Դϴ�.");
				
				
					
		
		}

	}

