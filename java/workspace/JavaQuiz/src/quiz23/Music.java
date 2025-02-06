package quiz23;

public class Music implements Runnable {
	@Override
	public void run() {
		System.out.println("음악을 15초간 재생합니다.");
		try {
			Thread.sleep(15000);
			System.out.println("음악 재생이 끝났습니다");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
