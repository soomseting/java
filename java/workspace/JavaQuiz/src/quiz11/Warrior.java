package quiz11;

public class Warrior extends Player {
	// 전사

	// 1. 생성자 - 이름을 전달받아서, hp = 1000, mp = 500으로 초기화
	Warrior(String name) {
		this.name = name;
		this.hp = 1000;
		this.mp = 500;
	}
	// 2. 으깨기기술 - 매개변수로 Player를 받습니다.
	// 스킬을 사용하면 나의 mp가 100이 소모가 됩니다.
	// 마나가 없으면 스킬을 사용할 수 없습니다.
	// 타격당한 상대방은 hp가 100이 소모가 됩니다.

	public void smash(Player player) {
		if (mp < 100) {
			System.out.println("스킬을 사용할 수 없습니다");
			System.out.println("---------------------------------------------");
			return;

		} else {
			this.mp -= 100;
			System.out.println(this.name + "님이 smash를 사용합니다");
			System.out.println(player.name + "에게 100만큼 피해를 입혔습니다");
			player.hp -= 100;
			System.out.println(player.name + "의 남은 hp: " + player.hp);
			System.out.println("---------------------------------------------");
		}
	}
}
