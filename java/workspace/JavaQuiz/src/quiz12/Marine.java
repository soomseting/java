package quiz12;

public  class Marine extends Unit {

	public static int attack = 6;
	public static int armor = 0;

	public Marine() {
		this.hp = 60;
	}

	
	public void location() {
		System.out.println("현재 위치는 x: " + x + ", y: " + y);
	}

	public void move(int x, int y) {
		System.out.println("x좌표를  " + x + "만큼, y좌표를 " + y + "만큼 이동함");

	}

	public void stop() {
		System.out.println("정지");
	}

	public void stimPack() {
		attack += 1;
		System.out.println();
	}
}
