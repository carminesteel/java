package ex5;

import java.util.Scanner;

public class S {

	public static void main(String[] args) {
		/*문제
		두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

		입력
		첫째 줄에 테스트 케이스의 개수 T가 주어진다.

		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

		출력
		각 테스트 케이스마다 A+B를 출력한다.*/
		
		Scanner s = new Scanner(System.in);
		int  t = 0; /*받는 변수*/
		
		t=s.nextInt();	/* t는 키보드입력값 */
		int[] R /*케이스 변수*/ = new int[t]; /*입력받은 만큼 생김*/
		int[] tot = new int [t]; /*합계 변수도 입력받은만큼 */
					
					for(int i = 0; i <=t; i++) {
						System.out.println("A 쳐라");
						int A = s.nextInt(); /*A는 키보드로 받음 */ 
						System.out.println("B 쳐라");
						int B = s.nextInt(); /*B 키보드 받음 */
						tot[t]= tot;						
						System.out.println(tot[t]);
						
						}
					

		}	
	}


