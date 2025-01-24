package quiz02;

public class Tv {
	/*
	 * 멤버변수 회사명 - String 
	 * 채널번호 - int 
	 * 전원 - boolean
	 * 
	 * 생성자 기본 생성자는 회사명을 초기화 LG
	 * 
	 * 메서드 
	 * 정보출력 - info() : 반환 void - 티비의 정보를 출력 
	 * 출금기능 - changeChannel(int) : 반환 int -
	 * 현재 채널을, 전달받은 값으로 변경하는 기능 
	 * 전원켜기 - power() : 반환 void - 전원을 껐다 켰다 하는기능
	 * 
	 */
	String company;
	int channelNum;
	boolean tvPower;

	Tv() {
		company = "LG";
	}

	Tv(int a) {
		company = "LG";
		channelNum = changeChannel(a);

	}

	// 정보부
	void info() {
		System.out.println("========Tv정보========");
		System.out.println("회사명: " + company);
		System.out.println("채널번호: " + channelNum);
		System.out.println("전원: " + tvPower);
	}

	// 채널부
	int changeChannel(int a) {
		channelNum = a;
		return channelNum;
	}

	// 전원부
	void power() {
		tvPower = !tvPower;
		if(tvPower) {
			System.out.println("전원 켜짐");
		}else {
			System.out.println("전원 꺼졌음");
		}
		
	}
}
