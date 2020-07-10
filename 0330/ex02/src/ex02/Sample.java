package ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args)throws Exception {
		Scanner s= new Scanner(System.in);	
		boolean run = true;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		while(run) {
			System.out.println("==========================================");
			System.out.println("1.���»��� | 2.��� | 3.���� | 4.��� | 5.���� | 6.����");
			System.out.println("==========================================");
		
			int menu=s.nextInt();
			switch(menu) {
			case 1 :
				System.out.println("���»���");
				String sql="insert into tbl_account (ano, aname, balance) values (?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				System.out.print("���¹�ȣ> ");
				String ano=s.next();
				System.out.print("�̸�> ");
				String aname=s.next();
				System.out.print("�ʱ��Աݾ�> ");
				int balance=s.nextInt();
				
				ps.setString(1, ano);
				ps.setString(2, aname);
				ps.setInt(3, balance);
				ps.execute();
				break;
			case 2 :
				sql="select * from tbl_account";
				ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				System.out.println("���¸��");
				System.out.println("���¹�ȣ\t����\t�ܾ�");
				while(rs.next())//rs�� ������ �ִµ��� �ݺ�) 
					{
					ano=rs.getString("ano");
					aname=rs.getString("aname");
					balance = rs.getInt("balance");
					System.out.print(ano + "\t");
					System.out.print(aname + "\t");
					System.out.println(balance + "\t");
					}
				break;
			case 3 :									
				System.out.println("����");
				System.out.print("�Ա��� ���� �Է�>");	
				String acinput = s.next();
				
				sql="select * from tbl_account where ano = ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, acinput);
				rs = ps.executeQuery();

				if(rs.next()) {
					aname = rs.getString("aname");
					System.out.println("������: " + aname);
					balance = rs.getInt("balance");
					System.out.println("�ܾ�: " + balance);
					System.out.print("�Ա��� �ݾ� �Է�>");					
					int suminput = s.nextInt();
					
					sql="update tbl_account set balance=balance+? where ano=?";
					ps = con.prepareStatement(sql);
						
					ps.setInt(1,suminput);
					ps.setString(2,acinput);
					ps.execute();
					
					System.out.println("�ԱݿϷ�!");
					System.out.println();				
				}else {
					System.out.println("���¹�ȣ�� �����ϴ�");
				}
				
				break;
			case 4 :
				System.out.println("����");
				System.out.print("����� ���� �Է�>");	
				String acinput2 = s.next();
				
				sql="select * from tbl_account where ano = ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, acinput2);
				rs = ps.executeQuery();

				if(rs.next()) {
					aname = rs.getString("aname");
					System.out.println("������: " + aname);
					balance = rs.getInt("balance");
					System.out.println("�ܾ�: " + balance);
					System.out.print("����� �ݾ� �Է�>");					
					int suminput = s.nextInt();
					
					sql="update tbl_account set balance=balance-? where ano=?";
					ps = con.prepareStatement(sql);
						
					ps.setInt(1,suminput);
					ps.setString(2,acinput2);
					ps.execute();
					
					System.out.println("��ݿϷ�!");
					System.out.println();				
				}else {
					System.out.println("���¹�ȣ�� �����ϴ�");
				}
				break;
			case 5 :
				System.out.println("���� ����");
				System.out.println("���� ��ȣ �Է��ϼ���");
				String acinput3 = s.next();
				sql="select * from tbl_account where ano = ?";
				ps = con.prepareStatement(sql);
				ps.setString(1, acinput3);
				rs = ps.executeQuery();
				
				if(rs.next()) {
				ano = rs.getString("ano");
				System.out.println("���¹�ȣ: " + ano);
				aname = rs.getString("aname");
				System.out.println("������: " + aname);
				balance = rs.getInt("balance");
				System.out.println("�ܾ�: " + balance);
				System.out.println("���°� �����մϴ�.");
				
				System.out.println("�� ���¸� �����Ͻðڽ��ϱ�?");
				String y = s.next();
				if(y.equals("y")||y.equals("Y")) {					
					sql="delete tbl_account where ano=?";
					ps = con.prepareStatement(sql);
					ps.setString(1,acinput3);
					ps.execute();
					System.out.println("���� �Ϸ� !!");
				}
				}else {
					System.out.println("���°� �����ϴ�.");
				}							
				break;
			case 6 :
				run=false;
				System.out.println("���α׷� ����");
			}
		}						
	}
}