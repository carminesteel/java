package ex06;

public class Sample {

	public static void main(String[] args) {
		String[] name = {"홍길동","심청이","강감찬"};
		int[] kor = {90,95,70};
		int[] eng = {90,95,70};
		int[] mat = {90,95,70};
		int[] tot =new int[3];
		double[] avg=new double[3];
		String[] grd=new String[3];
		int sumkor = 0;
		int sumeng = 0;
		int summat = 0;
		double sumavg = 0;
		String sumgrd;
		
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t평점");
			for(int i=0; i<=2; i++){
				tot [i]=kor[i]+eng[i]+mat[i];
				avg [i]=tot[i]/3.;
				if(avg[i]>=90) {grd[i]="A";} 
				else if (avg[i]>=80) {
						grd[i]="B";
				}
					else {
						grd[i]="C";
				}
				System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+avg[i]+"\t"+grd[i]);
				sumkor=sumkor + kor[i];
				sumeng=sumeng + eng[i];
				summat=summat + mat[i];
				sumavg=sumavg + avg[i];
				if(avg[i]>=90) {grd[i]="A";} 
				else if (avg[i]>=80) {
						grd[i]="B";
				}
					else {
						grd[i]="C";
				}
			}
			
			System.out.println("--------------------------------------");
			System.out.println("반평균\t" + sumkor/3+ "\t" + sumeng/3+"\t" + summat/3 + "\t" + "\t" + (int)sumavg/3);
			
	}

}
