package day08.encap.obj;

public class MainClass {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		
//		Chef c = new Chef();
//		hotel.setChef(c);
		hotel.setChef(new Chef());
		
		Chef chef = hotel.getChef();
		chef.cooking();
	}
}
