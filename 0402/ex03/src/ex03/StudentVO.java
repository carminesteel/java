package ex03;

public class StudentVO { //value object (���� ����ִ� ������Ʈ)
	//�ʵ�
	private String sname;
	private String sno;
	private String address;
	private String tel;
	
	
	//�޼ҵ�
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
