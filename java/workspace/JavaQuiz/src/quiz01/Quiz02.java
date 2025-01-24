package quiz01;

public class Quiz02 {
	public static void main(String[] args) {

		// 1. 랜덤한 정수 1~100이 주어질 때, 이 값이 5의 배수인지 확인하고, 출력하세요.
		int a = (int) (Math.random() * 100) + 1;
		System.out.println("랜덤 수 : " + a);
		System.out.println(a % 5 == 0 ? "배수임" : "배수아님");

		System.out.println("---------------------------------------");

		// 2. 랜덤한 정수 -5~5가 주어질 때, 언제나 이 값을 절대값으로 출력해주세요.
		int b = (int) (Math.random() * 11) - 5;
		System.out.println("랜덤한 수는 " + b);
		System.out.println(b < 0 ? -b : b);

		System.out.println("---------------------------------------");

		/*
		 * 3.사과 x개를 상자에 담을 때 필요한 상자의 개수를 구하려고합니다. 
		 * 한 상자에는 최대 10개의 사과가 들어 갈 수 있습니다.
		 * 사과의 개수가 1~150개 랜덤하게 주어질 때, 필요한 바구니의 개수를 구하는 프로그램을 작성하세요.
		 */
		
		int c = (int)(Math.random()*150)+1;
		int bucket = 10;
		System.out.println("사과의 개수는 " + c + "개고, 필요한 바구니 수는 " + (c % bucket == 0 ? c/bucket : c/bucket + 1));
		
		
	}
}
