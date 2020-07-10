package ex05;
import java.awt.image.RescaleOp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {
	


	public static void main(String[] args)throws Exception {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "1234";
				
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, user, password);
			
			
		   Scanner s = new Scanner (System.in);
		   boolean run = true;
		   while(run) {
			   System.out.println("성적입력 성적출력 종료");
			   int menu = s.nextInt();
			   
			   switch(menu) {
			   case 1:
				   String sql = "insert into tbl_grade(sno,sname,kor,eng,mat) Values(?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(sql);
					s = new Scanner(System.in);
					System.out.println("번호> ");
					String sno = s.next();
					System.out.println("성명> ");
					String sname = s.next();
					System.out.println("국어> ");
					int kor = s.nextInt();
					System.out.println("영어> ");
					int eng = s.nextInt();
					System.out.println("수학> ");
					int mat = s.nextInt();
					
					ps.setString(1, sno);
					ps.setString(2, sname);
					ps.setInt(3, kor);
					ps.setInt(4, eng);
					ps.setInt(5, mat);
					ps.execute();
					
					System.out.println("입력완료..");
				   break;
			   case 2:
				   String sql1 = "select * from tbl_grade order by kor+eng+mat desc";
				   ps=con.prepareStatement(sql1);
					ResultSet rs=ps.executeQuery();
					
					System.out.println("넘버\t네임\t콜\t잉"
							+ "\t맷\t톳");
					while(rs.next()) {
						kor=rs.getInt("kor");
						eng=rs.getInt("eng");
						mat=rs.getInt("mat");
						int tot=kor+eng+mat;
						double avg = (double)tot/3;
						
						System.out.print(rs.getString("sno")+"\t");
						System.out.print(rs.getString("sname")+"\t");
						System.out.print(rs.getInt("kor")+"\t");
						System.out.print(rs.getInt("eng")+"\t");
						System.out.print(rs.getInt("mat")+"\t");
						System.out.print(tot + "\t"); 
						System.out.println(Math.round(avg*100)/100.0);
						}
				   break;
			   case 3:
				   run = false;				   				   				   
			  }
		 }			   	
	}	   
}
