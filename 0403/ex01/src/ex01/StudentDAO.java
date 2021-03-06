package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentDAO {
	String sql=null;
	PreparedStatement ps= null;
	ResultSet rs = null;	//공통적으로 사용하는 선언 미리 뺴놓음
	
	//데이터베이스 접속
	public static Connection conn() throws Exception {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";

	Class.forName(driver);
	Connection conn=DriverManager.getConnection(url, user, password);		
	return conn; // 리턴으로 연결
	}

	
	//입력 메소드
	public void insert(StudentVO vo)throws Exception // 커넥션할때는 항상 
	{
		
		sql="insert into tbl_student2(sno,sname,tel) values (?, ?, ?)";
		ps=conn().prepareStatement(sql);
		ps.setString(1,  vo.getSno());
		ps.setString(2,  vo.getSname());
		ps.setString(3,  vo.getTel());
		ps.execute();
		conn().close(); // 커넥션을 해제해주어야 함.
	}
	
	//수정 메소드
	public void update(StudentVO vo)throws Exception {
		sql="update tbl_student2 set sname=?,tel=? where sno=?";
		ps=conn().prepareStatement(sql);
		ps.setString(1, vo.getSname());
		ps.setString(2, vo.getTel());
		ps.setString(3, vo.getSno());
		ps.execute();
		conn().close();
	}
	
	//조회	
	public StudentVO read(String sno) throws Exception {
		sql="select * from tbl_student2 where sno= ?";
		ps=conn().prepareStatement(sql);
		ps.setString(1, sno);
		rs=ps.executeQuery();
		StudentVO vo=new StudentVO();
		
		if(rs.next()) {			
			vo.setSno(rs.getString("sno"));
			vo.setSname(rs.getString("sname"));
			vo.setTel(rs.getString("tel"));						
		}
		conn().close();
		return vo;
	}
	
	//삭제
	public void delete(String sno) throws Exception {

		sql="delete from tbl_student2 where sno = ?";
		ps=conn().prepareStatement(sql);
		ps.setString(1, sno);
		ps.execute();
		conn().close();
	}
	//목록
	
	public ArrayList<StudentVO> list() throws Exception {
		ArrayList<StudentVO> array = new ArrayList<StudentVO>();
		sql="select* from tbl_student2";
		ps=conn().prepareStatement(sql);
		rs=ps.executeQuery();
		
		while(rs.next()) {
			StudentVO vo = new StudentVO();
			vo.setSno(rs.getString("sno"));
			vo.setSname(rs.getString("sname"));
			vo.setTel(rs.getString("tel"));
			array.add(vo);
		}
		return array;
		
	}
	
}
