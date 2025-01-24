package quiz02;

public class TvMain {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.power();
		tv.info();
		
		Tv tv2 = new Tv(5);
		tv.power();
		tv2.info();
	}
}
