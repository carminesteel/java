package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args)throws Exception{
		
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "1234";

			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url, user, password);	
		
		StudentDAO dao = new StudentDAO();		
		Scanner s = new Scanner(System.in);
		
		
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.�Է� | 2.��ȸ | 3.��� | 4.���� | 5.���� | 6.����");
			System.out.println("-----------------------------------------------");
			System.out.println("�޴����� > ");
			int menu = s.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("-------");
				System.out.println("�л��Է�");
				System.out.println("-------");


				StudentVO vo = new StudentVO();
				System.out.print("�л� ��ȣ�� �Է��ϼ���");
				String sno = s.next();

				vo=dao.read(sno);
				if(vo.getSno()==null) {
					vo.setSno(sno);
					System.out.println("���� > ");
					vo.setSname(s.next());
					System.out.println("��ȭ��ȣ > ");
					vo.setTel(s.next());
					dao.insert(vo);
				}else {
					System.out.println("�̹� �й��� �����մϴ�.");
				}
				/*
				System.out.print("�л� �̸��� �Է��ϼ���");
				vo.setSname(s.next());
				System.out.print("�л� ��ȭ��ȣ�� �Է��ϼ���");
				vo.setTel(s.next());
				
				try{ //try������ ������ �õ��غ���
					dao.insert(vo);
					System.out.println("�Է¿Ϸ�");
				}catch(Exception e) { // �ȵǸ� ~~
					System.out.println("�Է¿���");
					System.out.println(e.toString());
				}								*/
				break;
			case 2:
					System.out.println("---------");
					System.out.println("�л���ȸ");
					System.out.println("---------");
					sno=s.next();
					vo=dao.read(sno);
					if(vo.getSno()==null) {
						System.out.println("�л��� �������� �ʽ��ϴ�.");
					}else {
						System.out.println("���� : "+vo.getSname());
						System.out.println("��ȭ��ȣ : "+vo.getTel());
						System.out.println();
					}		
				break;
			case 3:
				System.out.println("--------------------------");
				System.out.println("�й�\t����\t��ȭ��ȣ");
				System.out.println("--------------------------");	
				ArrayList<StudentVO> array=dao.list();
				for(int i=0; i<array.size(); i++) {
					vo=array.get(i);
					System.out.print(vo.getSno()+"\t");
					System.out.print(vo.getSname()+"\t");
					System.out.println(vo.getTel()+"\t");
				}
				System.out.println();
				break;
			case 4:
				System.out.println("�����ҹ�ȣ> ");
				sno=s.next();
				vo=dao.read(sno);
				if(vo.getSno()==null) {
					System.out.println("�л��� �������� �ʽ��ϴ�.");
				}else {
					System.out.println("�̸�(" + vo.getSname()+")>");
					vo.setSname(s.next());
					System.out.println("��ȭ��ȣ(" + vo.getTel()+")>");
					vo.setTel(s.next());
					dao.update(vo);
					System.out.println("�����Ϸ�");
				}
				System.out.println();
				break;				
			case 5:
				System.out.println("-------");
				System.out.println("�л�����");
				System.out.println("-------");
				System.out.println("�����ҹ�ȣ");
				
				sno = s.next();
				vo=dao.read(sno);
				if(vo.getSno()==null) {
					System.out.println("������ �л��� �������� �ʽ��ϴ�");
				}else {
					dao.delete(sno);
					System.out.println("�����Ǿ����ϴ�.");
				}
				break;
			case 6:
				run=false;
			}			
		}	
	}
}