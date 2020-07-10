package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentDAO {
	String sql=null;
	PreparedStatement ps= null;
	ResultSet rs = null;	//���������� ����ϴ� ���� �̸� ������
	
	//�����ͺ��̽� ����
	public static Connection conn() throws Exception {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "system";
	String password = "1234";

	Class.forName(driver);
	Connection conn=DriverManager.getConnection(url, user, password);		
	return conn; // �������� ����
	}

	
	//�Է� �޼ҵ�
	public void insert(StudentVO vo)throws Exception // Ŀ�ؼ��Ҷ��� �׻� 
	{
		
		sql="insert into tbl_student2(sno,sname,tel) values (?, ?, ?)";
		ps=conn().prepareStatement(sql);
		ps.setString(1,  vo.getSno());
		ps.setString(2,  vo.getSname());
		ps.setString(3,  vo.getTel());
		ps.execute();
		conn().close(); // Ŀ�ؼ��� �������־�� ��.
	}
	
	//���� �޼ҵ�
	public void update(StudentVO vo)throws Exception {
		sql="update tbl_student2 set sname=?,tel=? where sno=?";
		ps=conn().prepareStatement(sql);
		ps.setString(1, vo.getSname());
		ps.setString(2, vo.getTel());
		ps.setString(3, vo.getSno());
		ps.execute();
		conn().close();
	}
	
	//��ȸ	
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
	
	//����
	public void delete(String sno) throws Exception {

		sql="delete from tbl_student2 where sno = ?";
		ps=conn().prepareStatement(sql);
		ps.setString(1, sno);
		ps.execute();
		conn().close();
	}
	//���
	
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