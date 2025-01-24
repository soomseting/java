package day06;

public class PhoneMain {
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.info();

		Phone red = new Phone("red");
		red.info();

		Phone black = new Phone("black", 30000);
		black.info();

		Phone purple = new Phone("purple", 1274000, "Galaxy S 24");
		purple.info();
	}
}
