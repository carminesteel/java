package ex03;

public class Sample {

	public static void main(String[] args) {
		//������ ����
		char a='A';
		String name = "��ȫö";
		System.out.println("�� : " + a);
		System.out.println("�̸� : " + name);

		int kor=85, eng=76, mat=77;
		double tot=kor+eng+mat;
		double avg=tot/3;
		
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println("���� : " + tot );
		System.out.println("��� = " + avg);
		
		//������ ����
		boolean stop=true;
			stop=false;
		System.out.println("stop = " + stop);

		int A = 158;
		int B = 185;
		
		boolean ab = A<B;
			System.out.println("ab test = " + ab);
		
	}
	
}
