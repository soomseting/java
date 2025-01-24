package quiz12;

public class MainClass {
	public static void main(String[] args) {
		Shape s = new Circle("원", 5);
//		s.getArea();
//		s.getName();

		System.out.println(s.getArea());
		System.out.println(s.getName());

		Shape s2 = new Rect("사각형", 2);
//		s2.getArea();
//		s2.getName();

		System.out.println(s2.getArea());
		System.out.println(s2.getName());

		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Marine m3 = new Marine();
		Marine m4 = new Marine();

		Tank t1 = new Tank();
		DropShip ship = new DropShip();
		ship.ride(m1);
		ship.ride(m2);
		ship.ride(m3);
		ship.ride(m4);
	}

}
