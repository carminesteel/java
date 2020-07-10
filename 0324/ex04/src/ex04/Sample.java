package ex04;

import java.util.Scanner;

public class Sample {
//main------------------------
	public static void main(String[] args) {
		
		//switch1();
		//score();
		score2();
	}
//score----------------------
	public static void score() {
		System.out.println("*********성적계산**********");
		Scanner scanner=new Scanner(System.in);
		System.out.print("국어>");
		int kor = scanner.nextInt();
		System.out.print("수학>");
		int mat = scanner.nextInt();
		System.out.print("영어>");
		int eng = scanner.nextInt();
		
		int tot = kor+ mat+ eng;
		int avg = tot/3;
		
		System.out.println("세 과목의 평균은 " + avg);
	
		System.out.println("세 과목의 총점 " + tot );
	}
	
	//switch----------------------
	public static void switch1() {
		System.out.println("switch 예제1");
		Scanner scanner = new Scanner(System.in);
		System.out.println("시간입력");
		int time = scanner.nextInt(); //키보드에서 데이터 입력을 받기 위해 Scanner 클래스를 생성
		
		switch(time) {
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 8 :
			System.out.println("출근을 합니다");
			break;
		case 10 :
			System.out.println("업무를 합니다");
			break;
		default:
			System.out.println("외근을 합니다");
		}
	}
		
		public static void score2() {
			System.out.println("*********성적계산**********");
			Scanner s=new Scanner(System.in);
			System.out.print("점수");
			int score = s.nextInt();
			if(score>=90) {
				System.out.println("학점은A");
			}else if(score>=80) {
				System.out.println("학점은B");

			}
			
			
			
	}
	
}
