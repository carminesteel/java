package ex04;

public class Sample {

	public static void main(String[] args) {
		//������?
		
		//����Ÿ�� ����
			//int, float, double, char, String <-- Ÿ���� �ƴϰ� Ŭ������ �빮��
		
		//�ڵ�����ȯ
			//ex) char -> int, int ->double
		//��������ȯ
			//ex) int -> char, double -> int
		
		
		// �ڵ�����ȯ (������ -> ū��)
		char charValue = 'B';
		int intValue = charValue;
		System.out.println(intValue);

		double doubleValue = charValue;
		System.out.println(doubleValue);
		
		intValue = 100;
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		//��������ȯ (ū�� -> ������)
		intValue = 65;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		doubleValue = 100.5;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		int kor = 90, eng = 100;
		double avg = (double)(kor+eng)/2;
		System.out.println(avg);
		//�� ������ int�� �������ε� avg �� double�� �Ǽ�.
		//����� �Ҽ��� �������� int ���� ����� ó���� ���� �����Ƿ�
		//{kor+eng)�տ� double �������� �������� ���� ����.
		//�Ǽ�+���� �Ǽ�/���� = �Ǽ�
		
		doubleValue = 12.4567;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		intValue = 68;
		charValue = (char)intValue;
		System.out.println(charValue);
	
	
		for(char i='A'; i<='Z'; i++ ) {
			intValue = i;
			System.out.println(i + ":" + intValue);
		}
		
	
	}

}