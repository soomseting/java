package quiz01;

public class Quiz13 {
	public static void main(String[] args) {
		//1. 7~100사이의 정수들 중에서 7의 배수를 *가로 로 출력
		for(int i = 7; i<=100; i++) {
			if(i%7 == 0) {
				System.out.print(i + " ");
			}
		}
		
		
		//줄바꿈
		//2. 200까지 정수 중에서 8의 배수의 개수를 출력
		int cnt = 0;
		for(int i = 1; i <= 200; i++) {
			if(i % 8 == 0) {
				cnt ++;
			}
		}
		System.out.println("\n8의 배수의 개수는 " + cnt);
		
		
		
		//3. 50~100 사이의 짝수의 합
		int sum = 0;
		for(int i = 50; i <= 100; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		System.out.println("\n50~100 사이 짝수들 합 " + sum);
		
		//4. A~Z까지 문자열의 합을 구하세요. ABCDEFG....Z
		//A=65, z=90
		char a = 65;
		String str = "";
		for(int i = a; i <= 90; i++) {
			str += a++;
		}
		System.out.println(str);
	}
}
