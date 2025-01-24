package quiz10;

public class MainClass {
	public static void main(String[] args) {
//		Computer com = new Computer();
		Computer com = new Computer(new KeyBoard(), new Mouse(), new Monitor());

		Monitor monitor = com.getMt();
		monitor.info();
		
		com.setMt(new Monitor());
		com.getMt().info();

	}
}
