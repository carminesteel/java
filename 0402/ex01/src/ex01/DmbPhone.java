package ex01;

public class DmbPhone extends Phone {
	//필드
	int channel;
	
	//일반생성자
	DmbPhone(String model, String color, int Channel){
		this.model=model;
		this.color=color;
		this.channel=channel;		
	}
	//메소드
	void turnonDmb() {
		System.out.println(channel+"번 DMB 방송을 수신합니다.");
	}
	void changeChannel(int channel){
		System.out.println(channel+"번으로 바꿉니다");
							
	}
	void turnOffDmb() {
		System.out.println("Dmb 방송을 종료합니다.");
	}
}

