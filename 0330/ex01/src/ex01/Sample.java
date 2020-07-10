package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args)throws Exception{
		
		Scanner s = new Scanner(System.in);
		
		boolean run = true;
		
		//데이터베이스 접속 명령어
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "system";
		String password = "1234";

		Class.forName(driver);
		Connection con=DriverManager.getConnection(url, user, password);
		
		while(run){
			System.out.println("-------------------------------");
			System.out.println("1.입력 | 2.출력 | 3.삭제 | 4.수정 | 5.종료");
			System.out.println("-------------------------------");
			System.out.print("작업선택 > ");
			int menu = s.nextInt();
			
			switch(menu) {
			case 1 : //입력
				String sql="insert into tbl_grade (sno, sname, kor, eng, mat, sum) values (?,?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				
				System.out.print("번호> ");
				String no=s.next();
				System.out.print("이름> ");
				String name=s.next();
				System.out.print("국어점수> ");
				int kor=s.nextInt();
				System.out.print("영어점수> ");
				int eng=s.nextInt();
				System.out.print("수학점수> ");
				int mat=s.nextInt();

				ps.setString(1, no);
				ps.setString(2, name);
				ps.setInt(3, kor);
				ps.setInt(4, eng);
				ps.setInt(5, mat);
				ps.setInt(6, kor+eng+mat);
				ps.execute();
				System.out.println("데이터 입력완료");
				
				break;
			case 2 : //출력
				sql="select * from tbl_grade";
				ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				System.out.println("번호\t성명\t국어\t영어\t수학\t평균");
				while(rs.next())//rs의 내용이 있는동안 반복) 
					{
					String sno=rs.getString("sno");
					String sname=rs.getString("sname");
					kor = rs.getInt("kor");
					eng = rs.getInt("eng");
					mat = rs.getInt("mat");
					System.out.print(sno + "\t");
					System.out.print(sname + "\t");
					System.out.print(kor + "\t");
					System.out.print(eng + "\t");
					System.out.print(mat + "\t");
					System.out.println(Math.round((kor+mat+eng)/3.*100)/100.0);
					}
				break;
			case 3 ://삭제
				System.out.print("번호> ");
				no=s.next();
				sql="delete from tbl_grade where sno = ?";
				ps=con.prepareStatement(sql);
				ps.setString(1, no);
				ps.execute();
				System.out.println("삭제되었습니다");
				
				break;
			case 4 : 			
			System.out.print("수정번호 > ");
			String sno = s.next();
			sql="select * from tbl_grade where sno =?";
			ps=con.prepareStatement(sql);
			ps.setString(1, sno);
			rs=ps.executeQuery();
			if(rs.next()) {
				String sname = rs.getString("sname");
				kor = rs.getInt("kor");
				eng = rs.getInt("eng");
				mat = rs.getInt("mat");
				System.out.println("성명 :" + sname);
				System.out.print("국어점수 :" + kor + " >");
				kor=s.nextInt();
				System.out.print("영어점수 :" + eng + " >");
				eng=s.nextInt();
				System.out.print("수학점수 :" + mat + " >");
				mat=s.nextInt();
				
				sql="UPDATE tbl_grade SET kor=?,eng=?,mat=? WHERE sno=?";
				ps=con.prepareStatement(sql);
				ps.setInt(1,kor);
				ps.setInt(2,eng);
				ps.setInt(3,mat);
				ps.setString(4,sno);
				ps.execute();
				System.out.println("데이터 수정완료!");
				System.out.println();					
			}else {
				System.out.println("데이터가 없습니다.");
			}
			
			System.out.println("완료");
			
			case 5 :
				run = false;
				System.out.println("프로그램 종료");
			}
		}						
	}
}
