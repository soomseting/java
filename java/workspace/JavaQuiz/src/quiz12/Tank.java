package quiz12;

public class Tank extends Unit {
	
	private boolean changeMode = false;

	public Tank(){
		this.hp = 100;
	}
	
	public void location() {
		System.out.println("현재 위치는 x: " + x + ", y: " + y);
	}
	public void move(int x , int y) {
		System.out.println("x를 " + x + "만큼, y를 " + y + "만큼 움직임");

	}
	public void stop() {
		System.out.println("정지");

	}
	public void changeMode() {
		changeMode = !changeMode;
		System.out.println("공격모드를 변경");
	}
}
