package ex03;

public class Report {//����������
	
	//�ʵ�
	private String sno;
	private String sname;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private char grade;		//����(90�̻�:A 80�̻�:B 70�̻�:C 70����:F)

	
	//������
	//�⺻������ �����̶� ����
	
	//�޼ҵ�
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		tot=kor+eng+mat;
		return tot;
	}
	public void setTot(int tot) { //���ʿ�
		this.tot = tot;
	}
	public double getAvg() {
		avg=(getTot())/3.; //tot���� �޾Ƽ� ������3 �� ���� avg
		return avg;
	}
	public void setAvg(double avg) { //���ʿ�
		this.avg = avg;
	}
	public char getGrade(){
		if(getAvg()>=90){
			grade ='A';
		}else if(getAvg()>=80) {
			grade ='B';
		}else if(getAvg()>=70) {
			grade ='C';
		}else {
			grade ='F';
		}		
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void printReport() {
		System.out.println("��ȣ:" + sno);
		System.out.println("�̸�:" + sname);
		System.out.println("����:" + kor);
		System.out.println("����:" + eng);
		System.out.println("����:" + mat);
		System.out.println("����:" + getTot());
		System.out.println("���:" + getAvg());
		System.out.println("����:" + getGrade());
	}
	
	public void printList() {
		
		System.out.print(sno + "\t");
		System.out.print(sname + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(getTot() + "\t");
		System.out.print(getAvg() + "\t");
		System.out.println(getGrade());
	}
}	