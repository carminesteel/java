package ex04;

//���� ������ Ŭ����
public class Grade {
	//�ʵ�
	
	String sno;
	String sname;
	int kor;
	int eng;
	int mat;
	int tot;
	double avg;
	char grade;
	
	//�⺻������
	
	public Grade() {
		
	}
	
	//������
	public Grade(String sno, String sname, int kor, int eng, int mat) {

		this.sno = sno;
		this.sname = sname;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//�޼ҵ�
	int total (int kor, int eng, int mat) {
		return kor + eng + mat;
	}
	//�޼ҵ� ���
	void printGrade() {
		this.tot=this.kor + this.eng + this.mat;
		this.avg=this.tot/3.;
		this.grade=grade(this.avg);
		System.out.println(this.sno+"\t"+this.sname+"\t"+this.kor+"\t"+this.eng+"\t"+this.mat+"\t"+this.tot+"\t"+this.avg+"\t"+this.grade);
		System.out.println();
	}
	
	char grade(double avg) {
		if(avg>=90) {
			return 'A';
		}else if(avg>=80) {
			return 'B';
		}else if(avg>=70) {
			return 'C';
		}else if(avg>=60) {
			return 'D';	
		}else {
			return 'F';
		}	
	}
}