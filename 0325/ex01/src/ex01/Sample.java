package ex01;

import java.util.Scanner;

public class Sample {
	
		public static void method1() {
		//�̸�, ����, ����, ���� Ű���忡�� �Է�
		//����, ��� ���
		                      
					Scanner s=new Scanner(System.in);	
					System.out.print("�̸� : ");
					String name = s.next();
					
						
								System.out.print("���� : ");
								int kor = s.nextInt();
								
								System.out.print("���� : ");
								int eng = s.nextInt();
								
								System.out.print("���� : ");
								int mat = s.nextInt();
						
								int tot = kor+eng+mat;
								double avg = (double)tot/3; //tot�� �����̱� ������ ��������ȯ
								
								System.out.println("���� : " + tot);
								System.out.println("��� : " + avg);
				}
	
		public static void method2() {
			//���� �������� �Է� �޾� ���� ���̸� ���Ѵ�.
			//�������� 0�̸� ���α׷� ����
			boolean run = true;
			
			while(run) {
				Scanner s=new Scanner(System.in);
				System.out.println("���ǹ����� : ");
				int r = s.nextInt();
				double area = r*r*3.14;
				System.out.println("���� ���� = " + area);
				
					if(r==0) {
						System.out.println("���α׷� ����");
						run=false;
					}
				}
			}
		
		public static void method3() {
			//�ﰢ���� ���̿� �غ��� Ű���忡�� �Է¹޴´�.
			//�ﰢ���� ���̸� ���Ͽ� ����Ѵ�.
			Scanner s = new Scanner(System.in);
			boolean run = true;
			while(run) {
					System.out.println("�ﰢ�� ���̸� ���ұ�? (y/n)");
					String q = s.next();
					if(q.equals("y")|| q.equals("Y")) {
					
							System.out.println("���� : ");
							int h = s.nextInt();
							System.out.println("�غ� : ");
							int w = s.nextInt();
							double area = h*w*1/2.;
							System.out.println("�ﰢ���� ���� : " + area);
							}else if(q.equals("n") || q.equals("N")) {
							run = false;
							System.out.println("���α׷� ����");}
							else {
							System.out.println("�߸� �Է��߽��ϴ�.");
						}
					
								
							}
					
					}
		
			
		public static void main(String[] args) {

			//method1();
			//method2();
			//method3();
			boolean run = true;
			while(run) {
							System.out.println("[1]�������α׷�");
							System.out.println("[2]���� ���� ���ϱ� ���α׷�");
							System.out.println("[3]�ﰢ�� ���� ���ϱ����α׷�");
							System.out.println("[4]���α׷� ����");
							
							Scanner s = new Scanner(System.in);
							int menu = s.nextInt();
							
							switch(menu) {
							case 1 : method1();
										break;
							case 2 : method2();
										break;
							case 3 : method3();
										break;
							case 4 : System.out.println("���α׷� ����");			
										run = false;
										break;
							default : System.out.println("�߸� �Է��߽��ϴ�.");
								
							}

					}
								
		}
	
	}