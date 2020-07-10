package ex05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {
	
			public static void main(String[] args) throws Exception {
				Scanner s = new Scanner(System.in);
				boolean run = true;
				
				//데이터베이스 접속
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "system";
				String password = "1234";
				
				Class.forName(driver);
				Connection con=DriverManager.getConnection(url, user, password);
				
				String sql = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				
				while(run) {
					System.out.println("-----------------------------------------------------------");
					System.out.println("1.성적입력 | 2.성적조회 | 3.성적표 | 4.삭제 | 5.성적 수정 | 6.종료");		
					System.out.println("-----------------------------------------------------------");	
					System.out.println("메뉴선택> ");
					int menu = s.nextInt();
					switch(menu) {
					case 1 :
						Report r=new Report();
						System.out.print("번호 >");
						r.setSno(s.next());
						System.out.print("이름 >");
						r.setSname(s.next());
						System.out.print("국어 >");
						r.setKor(s.nextInt());
						System.out.print("영어 >");
						r.setEng(s.nextInt());
						System.out.print("수학 >");
						r.setMat(s.nextInt());
						sql="insert into tbl_report values(?,?,?,?,?)";
						ps=con.prepareStatement(sql);
						ps.setString(1, r.getSno());
						ps.setString(2, r.getSname());
						ps.setInt(3, r.getKor());
						ps.setInt(4, r.getEng());
						ps.setInt(5, r.getMat());
						ps.execute();
						break;
						
					case 2 :			
						System.out.println("번호를 입력하세요");
						String num = s.next();
						sql="select * from tbl_report where sno=?";
						ps=con.prepareStatement(sql);
						ps.setString(1, num);
						rs=ps.executeQuery();
		
						if(rs.next()) {
							System.out.println("확인");
							r=new Report();
							r.setSno(rs.getString("sno"));
							r.setSname(rs.getString("sname"));
							r.setKor(rs.getInt("kor"));
							r.setEng(rs.getInt("eng"));
							r.setMat(rs.getInt("mat"));
							r.printReport();
						}else {
							System.out.println("없어요");
						}
						
						break;
					case 3 :
						sql="select * from tbl_report order by sno";
						ps=con.prepareStatement(sql);
						rs=ps.executeQuery();
						while(rs.next()) {
							r=new Report();
							r.setSno(rs.getString("sno"));
							r.setSname(rs.getString("sname"));
							r.setKor(rs.getInt("kor"));
							r.setEng(rs.getInt("eng"));
							r.setMat(rs.getInt("mat"));
							r.printList();
						}
						System.out.println();
						break;
					case 4 :			
						System.out.println("번호를 입력하세요");
						num = s.next();
						sql="select * from tbl_report where sno=?";
						ps=con.prepareStatement(sql);
						ps.setString(1, num);					
						rs=ps.executeQuery();
		
						if(rs.next()) {							
							sql="delete from tbl_report where sno=?";
							ps=con.prepareStatement(sql);
							ps.setString(1, num);
							ps.execute();
							System.out.println("했어요");
							
						}else {System.out.println("없어요");}
						break;
					case 5 :
						System.out.println("수정할 번호를 입력하세요");
						num = s.next();
						sql="select * from tbl_report where sno=?";
						ps=con.prepareStatement(sql);
						ps.setString(1, num);
						rs=ps.executeQuery();			
						if(rs.next()) {
							r=new Report();
							r.setSno(rs.getString("sno"));
							r.setSname(rs.getString("sname"));
							r.setKor(rs.getInt("kor"));
							r.setEng(rs.getInt("eng"));
							r.setMat(rs.getInt("mat"));
							
							System.out.println("이름 : "+r.getSname());
							System.out.println("국어("+r.getKor()+") >");
							r.setKor(s.nextInt());
							System.out.println("영어("+r.getEng()+") >");
							r.setEng(s.nextInt());
							System.out.println("수학("+r.getMat()+") >");
							r.setMat(s.nextInt());
							
							sql="update tbl_report set kor = ?, eng = ?, mat = ? where sno= ?";
							ps=con.prepareStatement(sql);
							
							ps.setInt(1, r.getKor());
							ps.setInt(2, r.getEng());
							ps.setInt(3, r.getMat());
							ps.setString(4, r.getSno());
							ps.execute();
							
							System.out.println("완료되었습니다.");
							
						}else {
							System.out.println("존재하지 않소");
						}
						break;
					case 6 :
						System.out.println("종료되었습니다.");
						run = false;				
			}

		}

	}

}
