package ex01;

public class Sample {

	public static void main(String[] args) {
				int score = 88 ; //다중 if 문 if if 와 if else
				
				System.out.println("점수는" + score + "입니다. \n"); 
				if( score>=90 ) {System.out.println("등급은 A입니다."); //else if문
				}else if(score>=80){
					
					System.out.println("등급은 B입니다."); // \n을 붙이면 한줄 더 띄울 수 있다.
				}else if(score>=70) {
					
					System.out.println("등급은 C입니다");
				}else {System.out.println("등급은 F입니다");
				} 
				
				//사원의 실적이 100만원 최우수, 50만원 우수, 30미만 보통 출력
				int sale = 70; //다중 if문
				if(sale >= 100) {System.out.println("최우수");
				
				}else if (sale >=50) {System.out.println("우수");
				
				}else {System.out.println("보통");
					
				}
				
				//중첩 if문
				//if 안에 else if 안에 else
		
				int score = 63;
				String grade="";
				
				if(score >= 90) {
						if(score >=95) {grade="A+";
						}else {grade="A0";}
						
				}else if(score >=80) {
						if(score >=85) {grade = "B+";
						}else {grade = "B0";}
						
				}else if(score >=70) {
						if(score >=75) {grade = "C+";
						}else {grade = "C0";}
						
				}else if(score >=60) {
						if(score >=65) {grade = "D+";
						}else {grade = "D0";}
						}
				
				else {grade = "F";
						}
				
				System.out.println("등급은" + grade + "입니다.");
				
				
					
		
		}

	}


