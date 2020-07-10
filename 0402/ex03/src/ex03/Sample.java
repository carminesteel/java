package ex03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) throws Exception {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		String sql=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		Scanner s = new Scanner(System.in);
		
		
		
		boolean run =true;
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.�����Է� | 2.������ȸ | 3.�������� | 4.�������� | 5.���α׷� ����");
			System.out.println("----------------------------------------------------------");
			System.out.print("�޴����� > ");
			int menu = s.nextInt();
			switch(menu) {
			case 1:
				boolean run2 = true;
				while(run2) {
					SungjukVO sjv = new SungjukVO();
					System.out.print("��ȣ > ");
					sjv.setSno(s.next());
					sql="select * from tbl_student where sno=?";
					ps=con.prepareStatement(sql);
					ps.setString(1, sjv.getSno());
					rs=ps.executeQuery();
					if(rs.next()) {
						System.out.println("�̸� :"+rs.getString("sname"));
						System.out.print("��� > ");
						sjv.setSmonth(s.next());
						System.out.print("���� > " );
						sjv.setKor(s.nextInt());
						System.out.print("���� > " );
						sjv.setEng(s.nextInt());
						System.out.print("���� > " );
						sjv.setMat(s.nextInt());				
						
						sql = "insert into tbl_sungjuk (sno,smonth,kor,eng,mat) values (?,?,?,?,?)";
						ps = con.prepareStatement(sql);
						ps.setString(1, sjv.getSno());
						ps.setString(2, sjv.getSmonth());
						ps.setInt(3, sjv.getKor());
						ps.setInt(4, sjv.getEng());
						ps.setInt(5, sjv.getMat());
						ps.execute();
						
						System.out.println("�Է¿Ϸ�");
						run2 = false;
					}else {
						System.out.println("�����");
						run2 = true;
					}
				}								
				break;
			case 2:
				boolean run3 = true;
				while(run3) {
					System.out.println("���� ��ȸ ");
					SungjukVO sjv = new SungjukVO();
					System.out.println("��ȸ�� �л��� ��ȣ�� �Է��ϼ���");
					String no = s.next();
					sql="select * from tbl_student where sno = ?";
					ps = con.prepareStatement(sql);
					ps.setString(1, no);
					rs = ps.executeQuery();
					if(rs.next()) {
						System.out.println("���� : "+rs.getString("sname"));
						sql="select * from tbl_sungjuk where sno = ?";
						ps = con.prepareStatement(sql);
						ps.setString(1, no);
						rs = ps.executeQuery();
						System.out.println("�й�\t��\t��\t��\t��");
						while(rs.next()) {
							System.out.print(rs.getString("sno")+"\t");
							System.out.print(rs.getString("smonth")+"\t");
							System.out.print(rs.getInt("kor")+"\t");
							System.out.print(rs.getInt("eng")+"\t");
							System.out.println(rs.getInt("mat"));
							System.out.println("-----------------------------------");
							run3=false;
						}
				}else {
					System.out.println("�����");
					run3 = true;				
				}				
				}
				break; 
			case 3:
				boolean run4 = true;
				while(run4) {
					System.out.println("���� ���� ")	;				
					System.out.println("������ �л��� ��ȣ�� �Է��ϼ���");
					String no = s.next();
					sql="select * from tbl_student where sno = ?";
					ps = con.prepareStatement(sql);
					ps.setString(1, no);
					rs = ps.executeQuery();
					if(rs.next()) {
						SungjukVO vo = new SungjukVO();
						System.out.println("���� : "+rs.getString("sname"));
						System.out.println("������ ���� �Է��ϼ���");
						String mon = s.next();
						sql="select * from tbl_sungjuk where smonth = ?";						
						ps = con.prepareStatement(sql);
						ps.setString(1, mon);
						rs = ps.executeQuery();
						boolean month =	true;
						while(month)
						if(rs.next()) {
							System.out.println(mon+"�� ���� ����");		
							
							System.out.print("���� > " );
							vo.setKor(s.nextInt());
							System.out.print("���� > " );
							vo.setEng(s.nextInt());
							System.out.print("���� > " );
							vo.setMat(s.nextInt());
							
							sql="update tbl_sungjuk set kor=?,eng=?,mat=? where smonth=? and sno=?";
							ps = con.prepareStatement(sql);
							ps.setInt(1, vo.getKor());
							ps.setInt(2, vo.getEng());
							ps.setInt(3, vo.getMat());
							ps.setString(4, mon);
							ps.setString(5, no);
							ps.execute();
							System.out.println("�����Ϸ�");
							month = false;
						}else { month = true;
							System.out.println("");
						}
						
							run4=false;
					}
						
				break;
				}
			case 4:
				boolean remove = true;
				while(remove) {
					System.out.println("���� ���� ")	;				
					System.out.println("������ �л��� ��ȣ�� �Է��ϼ���");
					String no = s.next();
					sql="select * from tbl_student where sno = ?";
					ps = con.prepareStatement(sql);
					ps.setString(1, no);
					rs = ps.executeQuery();
					if(rs.next()) {
						SungjukVO vo = new SungjukVO();
						System.out.println("���� : "+rs.getString("sname"));
						System.out.println("����� ������ �����Ͻǰǰ���?");
						String mon = s.next();
						sql="select * from tbl_sungjuk where smonth = ?";						
						ps = con.prepareStatement(sql);
						ps.setString(1, mon);
						rs = ps.executeQuery();
						boolean month =	true;
						while(month)
						if(rs.next()) {
							System.out.println(mon+"�� ���� ����");								
							sql="delete from tbl_sungjuk where smonth = ? and sno = ?";
							ps = con.prepareStatement(sql);
							ps.setString(1, mon);
							ps.setString(2, no);
							ps.execute();
							System.out.println("�����Ϸ�");
							month = false;
						}else {
							System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
							month = false;
						}
						
					}
					remove = false;	
					
				}break;			
			case 5:
				run=false;
				System.out.println("���α׷� ����");
				}		
				
			}
		}
				
		
	}

