package thread.ex01;

public class MainClass {
	public static void main(String[] args) {
		// 메인쓰레드
		// 객체 1개를 쓰레드 n개로 실행 - 동시성의 문제가 생길 수 있음
		ThreadTest th = new ThreadTest(); //객체는 1개 밑에 thread는 2개

		Thread thread = new Thread(th, "A");// 러너블, 쓰레드 명
		Thread thread2 = new Thread(th, "B");// 러너블, 쓰레드 명
		thread.start();
		thread2.start();

		try {
			Thread.sleep(5000);
			System.out.println("메인쓰레드 종료");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
