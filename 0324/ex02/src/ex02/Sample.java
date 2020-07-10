package ex02;

public class Sample {

	public static void main(String[] args) {
		
			String name = "홍길동";
			int kor = 90, eng=90, mat=90;
			double tot=kor+eng+mat;
			double avg=tot/3;
			String grade = "";
			
			if(avg>=90) {
				if(avg >=95) {
					grade="A+";
				}else {
					grade="A0";
				}
			}else if(avg>=80) {
				if(avg>=85) {
					grade="B+";
				}else {
					grade="B0";
				}
			}else if (avg>=70) {
				if(avg>=65) {
					grade = "C+";}
				else {
					grade = "C0";
			}
			
	
			}
			//성적표 출력
			System.out.println("이름 : " + name);
			System.out.println("국어 : " +kor);
			System.out.println("영어 : " +eng);
			System.out.println("수학 : " +mat);
			System.out.println("총점 : " +tot);
			System.out.println("평균 : " +avg);
			System.out.println("등급 :  " + grade);
			
			
			String name1 = "냉장고";
			int price = 100;
			int number = 5;
			int total = (price*number) ;
			String grade1 ="";
			
			if(total >=1000) 
			   {grade= "최우수";}
				
				else if(total >=500) 
							{grade ="우수";}
			
				else{grade ="보통";}
			
			System.out.println("상품명 : " + name );
			System.out.println("단가 :" + price + "만원");
			System.out.println("판매량 :" + number + "개");
			System.out.println("총 판매량 :" + (price*number) + "만원");
			System.out.println("당신의 판매액은 " + total + "만원 입니다. \n");
			System.out.println("그러므로 당신은 " + grade + "입니다." );
			
	}

}
