package quiz01;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 
		 * 랜덤한 1~100 사이의 수로 문제를 생성하고, 정답 맞추기 프로그램
		 * 
		 * 1. 0을 입력하면 종료가 됩니다.
		 * 2. 종료될 때는 정답, 오답 개수를 출력해 주세요.
		 * 
		 * 
		 */
		
		
		int sum = 0;
		int disum = 0;
		while(true) {
			int a = (int)(Math.random()*100)+1;
			int b = (int)(Math.random()*100)+1;
			System.out.println("--------------------------");
			System.out.println(a + " + " + b + " = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요");
			System.out.print(">");
			int n = sc.nextInt();
			
			if(n == (a+b)) {
				System.out.println("정답입니다.");
				sum++;
			}else if(n != (a+b)) {
				if(n == 0) {
					System.out.println("프로그램 정상 종료");
					System.out.println("정답:"+sum);
					System.out.println("오답:"+disum);
					break;
				}else {
				System.out.println("틀렸는데여?");
				disum++;
				}
			}
		}
	}
}
