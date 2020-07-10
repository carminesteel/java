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
			System.out.println("1.입력 | 2.조회 | 3.목록 | 4.수정 | 5.삭제 | 6.종료");
			System.out.println("-----------------------------------------------");
			System.out.println("메뉴선택 > ");
			int menu = s.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("-------");
				System.out.println("학생입력");
				System.out.println("-------");


				StudentVO vo = new StudentVO();
				System.out.print("학생 번호를 입력하세요");
				String sno = s.next();

				vo=dao.read(sno);
				if(vo.getSno()==null) {
					vo.setSno(sno);
					System.out.println("성명 > ");
					vo.setSname(s.next());
					System.out.println("전화번호 > ");
					vo.setTel(s.next());
					dao.insert(vo);
				}else {
					System.out.println("이미 학번이 존재합니다.");
				}
				/*
				System.out.print("학생 이름를 입력하세요");
				vo.setSname(s.next());
				System.out.print("학생 전화번호를 입력하세요");
				vo.setTel(s.next());
				
				try{ //try문에서 구문을 시도해보고
					dao.insert(vo);
					System.out.println("입력완료");
				}catch(Exception e) { // 안되면 ~~
					System.out.println("입력오류");
					System.out.println(e.toString());
				}								*/
				break;
			case 2:
					System.out.println("---------");
					System.out.println("학생조회");
					System.out.println("---------");
					sno=s.next();
					vo=dao.read(sno);
					if(vo.getSno()==null) {
						System.out.println("학생이 존재하지 않습니다.");
					}else {
						System.out.println("성명 : "+vo.getSname());
						System.out.println("전화번호 : "+vo.getTel());
						System.out.println();
					}		
				break;
			case 3:
				System.out.println("--------------------------");
				System.out.println("학번\t성명\t전화번호");
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
				System.out.println("수정할번호> ");
				sno=s.next();
				vo=dao.read(sno);
				if(vo.getSno()==null) {
					System.out.println("학생이 존재하지 않습니다.");
				}else {
					System.out.println("이름(" + vo.getSname()+")>");
					vo.setSname(s.next());
					System.out.println("전화번호(" + vo.getTel()+")>");
					vo.setTel(s.next());
					dao.update(vo);
					System.out.println("수정완료");
				}
				System.out.println();
				break;				
			case 5:
				System.out.println("-------");
				System.out.println("학생삭제");
				System.out.println("-------");
				System.out.println("삭제할번호");
				
				sno = s.next();
				vo=dao.read(sno);
				if(vo.getSno()==null) {
					System.out.println("삭제할 학생이 존재하지 않습니다");
				}else {
					dao.delete(sno);
					System.out.println("삭제되었습니다.");
				}
				break;
			case 6:
				run=false;
			}			
		}	
	}
}
