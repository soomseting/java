package quiz08;

public class MainClass {
	public static void main(String[] args) {
		SuperSonicAp ap = new SuperSonicAp("아시아나");
		ap.takeOff();//상속받음
		ap.fly();
		ap.flyMode = 1;
		ap.fly();
		ap.land();
		ap.info();
	}
}
