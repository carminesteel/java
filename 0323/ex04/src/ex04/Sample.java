package ex04;

public class Sample {

	public static void main(String[] args) {
		//변수란?
		
		//변수타입 종류
			//int, float, double, char, String <-- 타입이 아니고 클래스라 대문자
		
		//자동형변환
			//ex) char -> int, int ->double
		//강제형변환
			//ex) int -> char, double -> int
		
		
		// 자동형변환 (작은것 -> 큰것)
		char charValue = 'B';
		int intValue = charValue;
		System.out.println(intValue);

		double doubleValue = charValue;
		System.out.println(doubleValue);
		
		intValue = 100;
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		//강제형변환 (큰것 -> 작은것)
		intValue = 65;
		charValue = (char)intValue;
		System.out.println(charValue);
		
		doubleValue = 100.5;
		intValue = (int)doubleValue;
		System.out.println(intValue);
		
		int kor = 90, eng = 100;
		double avg = (double)(kor+eng)/2;
		System.out.println(avg);
		//각 점수는 int로 정수값인데 avg 는 double로 실수.
		//결과는 소수로 나오지만 int 값이 제대로 처리가 되지 않으므로
		//{kor+eng)앞에 double 선언으로 디테일한 값을 얻어낸다.
		//실수+정수 실수/정수 = 실수
		
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
