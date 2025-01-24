package quiz12;

public  class DropShip extends Unit {
	private Unit[] arr = new Unit[8];
	private int index = 0;

	public DropShip() {
		this.hp = 60;
	}

	@Override
	public void location() {
		System.out.println("현재 위치는 x: " + x + ", y: " + y);

	}

	@Override
	public void move(int x, int y) {
		System.out.println("x를 " + x + "만큼, y를 " + y + "만큼 움직임");

	}

	@Override
	public void stop() {
		System.out.println("정지");
	}

	public void ride(Unit unit) {

		if (unit instanceof Marine && index <= 7) {
			arr[index] = unit;
			index++;
		} else if (unit instanceof Tank && index <= 4) {
			arr[index] = unit;
			index += 4;
		}else {
			System.out.println("수송선에 자리가 부족합니다");
		}

	}
}
