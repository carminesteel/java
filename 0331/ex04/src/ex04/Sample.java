package ex04;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
				
		boolean run = true;
		Scanner s=new Scanner(System.in);
		Grade[] grade=new Grade[100];
		int count = 0;
		
		
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.성적입력 | 2.성적목록 | 3.성적조회 | 4.종료");
			System.out.println("-----------------------------------------");
			System.out.println("메뉴선택 >");
			int menu=s.nextInt();
			switch(menu) {
			case 1:

				grade[count]=new Grade();
				System.out.println("학번>");
				grade[count].sno=s.next();
				System.out.println("성명>");
				grade[count].sname=s.next();
				System.out.println("국어>");
				grade[count].kor=s.nextInt();
				System.out.println("영어>");
				grade[count].eng=s.nextInt();
				System.out.println("수학>");
				grade[count].mat=s.nextInt();
				System.out.println("입력완료\n");
				
				count++;
				
				break;
			case 2:
				for(int i=0; i<count; i++) {
					grade[i].printGrade();
				}
				break;
			case 3:
				//입력
				System.out.println("조회할 번호");
				String no=s.next();
				
				boolean find=false;
				for(int i=0; i<count; i++) {
					if(no.equals(grade[i].sno)) {
						System.out.println("성명 : " + grade[i].sname);
						System.out.println("국어 : " + grade[i].kor);
						System.out.println("영어 : " + grade[i].eng);
						System.out.println("수학 : " + grade[i].mat);
						System.out.println("평균 : " + grade[i].avg);
						find=true;
					}
				}
				if(find==false) {
					System.out.println("번호가 존재하지 않습니다.");
				}
			
				break;
			case 4:
				run=false;
				System.out.println("프로그램 종료");
				
			}
		}
		
		
		
	}

}
