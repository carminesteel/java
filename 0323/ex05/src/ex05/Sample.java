package ex05;

public class Sample {

	public static void main(String[] args) {
		
		//연산자
		//1)산술연산자
		//2)관계연산자
		//3)논리연산자
		//4)상항연산자
		//5)단항연산자
		//6)대입연산자
		
		//산술연산자
		int num1 = 10;
		int num2 = 5;
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4 = num1 / num2;
		int result5 = num1 % num2;
		//+, -, *, /, % 연산결과 출력
		System.out.println(num1 + "+" + num2 + "=" + result1);
		System.out.println(num1 + "-" + num2 + "=" + result2);
		System.out.println(num1 + "*" + num2 + "=" + result3);
		System.out.println(num1 + "/" + num2 + "=" + result4);
		System.out.println(num1 + "%" + num2 + "=" + result5);
		
		double numA = 147.8;
		double numB = 142.1;
		double resultX = (numA*numB)/3.5;
		System.out.println(resultX);

		double resultY = (resultX * numA)/1.2;
		System.out.println(resultY);
		
		//관계연산자
		boolean result6=(num1==num2);
		System.out.println(num1 + "==" + num2 + ":" + result6);
		//num1의 값과 num2의 값이 같지 않으므로
		//적용시 false
		result6 = (num1 > num2);
		System.out.println(num1 + ">" + num2 + ":" + result6);
		result6 = (num1 < num2);
		System.out.println(num1 + "<" + num2 + ":" + result6);
		result6 = (num1 <= num2);
		System.out.println(num1 + "<=" + num2 + ":" + result6);
		result6 = (num1 >= num2);
		System.out.println(num1 + ">=" + num2 + ":" + result6);
		result6 = (num1 != num2);
		System.out.println(num1 + "!=" + num2 + ":" + result6);
		
		
		//논리연산자 (and  &&  , or || , not ! )
		result6 = (num1>10)  || (num2<6); //또는 or ((둘중하나만 참이어도/ 거짓이어도))
		System.out.println("------------------");
		System.out.println(result6);
		
		result6 = (num1>10)  && (num2<6); //그리고 and ((둘다 참/거짓일경우))
		System.out.println(result6);
		
		// !는 not (결과의 반대)
		
		
		//if 구문
		int age = 23;
		char gender = 'M';
		//20세 이상 남자면 입장가능 아니면 불가능 출력
		if((age>=20) && (gender == 'M')) {
		System.out.println("입장가능");}else {System.out.println("입장불가능");
		}
		
		int kor=90, eng=60;
		//국어, 영어 점수가 각각 70점 이상 평균이 70이상이면 합격
		double avg=(double)(kor+eng)/2;
		if(kor>=70 && eng>=70 && avg >=70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		if(kor>=70 && eng>=70 && ((kor+eng)/2)>=70) {
			System.out.println("합격");
		} else {System.out.println("불합격");
		}
		
		if((kor>=70 && eng>=70)&&((kor+eng)/2)>=70) {
			System.out.println("합격");
		} else {System.out.println("불합격");
		
		if((kor>=70 || eng>=70)||((kor+eng)/2)>=70) {
			System.out.println("합격");
		} else {System.out.println("불합격");}
		
		//삼항연산자
		int grade = 65;
		if(grade <70) {System.out.println("불합격");}
		else {System.out.println("합격");}
		
		//위와 같은 if 구문을 상항연산자로 ?를 이용해 작성가능.
		//조건식이 만족하면 전자, 불만족시 후자로 표기.
		String result=(grade<70) ? "불합격":"합격";
		System.out.println(result);
		
		
		//단항연산자 ++, -- 원 값에서 더하거나 뺌.
		System.out.println(--grade);
		
		//대입연산자
		grade = 60;
		System.out.println(grade);
		grade+=2;  //grade 값에서 2만큼 더해짐  // grade = grade + 2;
		System.out.println(grade);
		grade=grade+2;
		System.out.println(grade);
		grade+=2;
		System.out.println(grade);
		}
		
		int A=5;
		A*=2.7;
		System.out.println(A);
	}

}
