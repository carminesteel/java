package ex01;

public class Student {
	String sno;
	String sname;
	String tel;
	
	//기본생성자
	Student(){
		
	}
	//일반생성자
	Student(String sno, String sname, String tel){
		this.sno=sno;
		this.sname=sname;
		this.tel=tel;
		
	//똑같은 이름으로 생성자를 두번 생성 = 오버로딩	
	}	
	
	
	//메소드
	public void print(Student s) {
		System.out.println("-----------------------------");
		System.out.println("번호"+s.sno);
		System.out.println("이름"+s.sname);
		System.out.println("전화번호"+s.tel);
	}
}
