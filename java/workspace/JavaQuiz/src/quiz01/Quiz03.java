package quiz01;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		/*
		 * 두 정수 A B를 한 번에 입력받은 다음에 A + B의 결과를 출력하는 프로그램 코드
		 * 
		 * 입력 
		 * 1 2
		 * 출력
		 * 3
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 A B를 입력하세요.");
		int a = sc.nextInt(); //a를 입력받음
		int b = sc.nextInt(); //이어서 b를 입력받음
		System.out.println("두 정수 A와 B의 합은 " + (a + b) + "입니다.");
		
		sc.close();// 자원 낭비 방지
	}
}
