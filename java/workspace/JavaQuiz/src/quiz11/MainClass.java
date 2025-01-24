package quiz11;

public class MainClass {
	public static void main(String[] args) {
//		Player p1 = new Warrior("홍길동");
//		Player p2 = new Warrior("홍홍홍");
//		Player p3 = new Soceress("김법사");
//		p1.info();
//		p2.info();
//		p3.info();
//		p1.smash(p2);
//		p1.smash(p3);
//		p1.smash(p3);
//		p1.smash(p3);
//		p1.smash(p3);
//		p1.smash(p3);
//		Player[] players = {p1,p2};
//		p3.blizzard(players);
//		p3.blizzard(players);
//		p3.blizzard(players);
//		p3.blizzard(players);
//		p3.blizzard(players);
//		p3.blizzard(players);
		
		Warrior w = new Warrior("나는전붕이다");
		Warrior w2 = new Warrior("타락파워전사");
		Soceress s = new Soceress("drakeDog");
		w.smash(w2);
		w.smash(s);
		w2.info();
		w.info();
		
		Player[] arr = {w,w2};//플레이어 배열에 전사, 마법사가 들어갈 수 있음
		s.blizzard(arr);
		
		w2.info();
		s.info();

	}
}
