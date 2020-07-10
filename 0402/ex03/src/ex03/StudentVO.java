package ex03;

public class StudentVO { //value object (값이 들어있는 오브젝트)
	//필드
	private String sname;
	private String sno;
	private String address;
	private String tel;
	
	
	//메소드
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
			
}
