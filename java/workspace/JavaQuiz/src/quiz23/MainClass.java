package quiz23;

public class MainClass {
	public static void main(String[] args) {
		Music music = new Music();
		Download download = new Download();
		Thread thread = new Thread(music);
		Thread thread2 = new Thread(download);
		thread.start();
		thread2.start();
		try {
			thread.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
