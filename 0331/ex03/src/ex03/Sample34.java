package ex03;

public class Sample34 {

	public static void main(String[] args) {
		
		System.out.println("ssssssssssss");
		System.out.println("-------------------");
		
		Grade[] grade=new Grade[2];
		grade[0]=new Grade("01","ȫ�浿",90,70,77);
		grade[1]=new Grade("02","��û��",80,63,90);
		
		for(int i=0; i<=grade.length-1; i++) {
			grade[i].printgrade(grade[i]);
		}

	}

}
