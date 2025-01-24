package day05;

public class MethodEx01 {
	public static void main(String[] args) {
		/*
		 * 1. 함수는 만들고, 사용하는 과정(호출)이 있습니다. 2. 메서드 안에는 메서드를 선언할 수 없습니다.
		 */

		// 멋진 기능을 하나 만들어야지~ 1부터 10까지 합계

		System.out.println(sumNum());
		int num = sumNum();
		System.out.println(num);

		// 문자열을 반환하는 함수~
		String result = randomStr();
		System.out.println(result);
	}

	// 함수
	static int sumNum() {// 반환타입은 int, 입력 값은 없다.
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		return sum;
	}

	// 함수
	static String randomStr() {
		String str = "";
		for(char c = 'A'; c<='Z';c++) {
			str += c;
		}
		return str;
	}

}
