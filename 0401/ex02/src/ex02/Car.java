package ex02;
//public , private => 접근제한자
public class Car {
	//필드(속성)
	private String company; //기본적으로 직접 필드값을 수정할 수 없기 때문에 private 주고 set, get method로 입력 출력을 한다.
	private int maxSpeed;
	
	//set()메소드
	public void setCompany(String company) {
		this.company=company;
	}
	public void setMaxspeed(int maxSpeed) {
		if(maxSpeed < 0) { //setMaxspeed 안의 if문이 음수를 받았을 시 0으로 나오도록 설정한다.
			this.maxSpeed=0;
		}else {
		this.maxSpeed=maxSpeed;
		}
	}
	//get()메소드
	public String getCompany() {
		return company;
	}
	public int getmaxSpeed(){
		return maxSpeed;
	}
	
	//생성자
	Car(){
		
	}
	
	//메소드
	void printCar() {
		System.out.println("제조사 : " + company);
		System.out.println("최대속도 : " + maxSpeed + "Km");
	}
}	
