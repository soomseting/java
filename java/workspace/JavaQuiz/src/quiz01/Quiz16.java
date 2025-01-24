package quiz01;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		//숙제
		/*
		 * 어떤 수를 입력 받아서, 입력받은 수 까지의 모든 소수들의 합계를 구합니다.
		 * 소수 - 약수가 1과 자기자신인 수(약수의 개수가 2개)
		 * 
		 * 예를 들어서
		 * 1 -> 소수x
		 * 2 -> 소수
		 * 3 -> 소수
		 * 5 -> 소수
		 * 7,11,13,17,19 -> 소수
		 * 
		 * 입력 출력
		 * 10  -> 2 + 3 + 5 + 7 = 17
		 * 13  -> 2 + 3 + 5 + 7 + 11 + 13 = 41
		 */
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수입력>");
//		int a = sc.nextInt();
//		int sum = 0;
//		for(int i = 2; i <= a; i++) {
//			if(i == 2 || i == 3 || i == 5 || i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
//				sum += i;
//			}
//		}
//		System.out.println(sum);
	
		System.out.print("정수>");
		int num = sc.nextInt();
		int sum = 0;
		int cnt = 0;
		for(int i = 1; i<= num; i++) {
			//1의 약수개수, 2의 약수개수, ..... num까지 약수의 개수
			for(int j = 1; j <= i; j++) {
				
				//요기서 약수 개수를 구해보면
				if(i % j == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				//i는 소수라고 할 수 있음.
				sum += i;
			}
			cnt = 0;//cnt 무한 증가를 방지하기 위한 재 초기화
		}
		System.out.println(num + "까지 소수의 합:" + sum);
	
	}
}
