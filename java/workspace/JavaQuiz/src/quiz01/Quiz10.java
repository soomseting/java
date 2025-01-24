package quiz01;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//1. 1~입력받은 수 까지의 6의 배수의 합
		/*
		 * int a = sc.nextInt(); 
		 * int sum = 0; 
		 * for(int i = 1; i<=a; i++) { 
		 * 	if(i%6 == 0) {
		 * 		sum += i; 
		 * 	} 
		 * } 
		 * System.out.println("1~입력받은 수 까지의 6의 배수의 합 " + sum);
		 */
		int num = sc.nextInt();
		int i = 1;
		int sum01 = 0;
		while (i <= num) {
			if (i % 6 == 0) {
				sum01 += i;
			}
			i++;
		}
		System.out.println("6배수의 합 " + sum01);

		// 2. 1~100까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 개수
		/*
		 * int sum2 = 0; 
		 * for(int i = 1; i<=100;i++) { 
		 * 	if(i % 4 == 0 && i % 8 != 0) {
		 * 		sum2 += 1; 
		 * 	} 
		 * } 
		 * System.out.println("1~100까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수의 개수 " + sum2); int sum3 = 0;
		 */
		int a = 1;
		int cnt = 0;
		while (a <= 100) {
			if (a % 4 == 0 && a % 8 != 0) {
				cnt++;
			}
				a++;
		}
		System.out.println("1~100까지 4,8의 개수: " + cnt);

		// 3. 50~100까지 정수들의 합
		/*
		 * for(int i = 50; i <= 100; i++) { 
		 * 	sum3 += i; 
		 * }
		 * System.out.println("50~100까지 정수들의 합 " + sum3);
		 */
		int n = 50;
		int sum2 = 0;
		while(n<=100) {
			sum2+=n;
			n++;
		}
		System.out.println("합계 : " + sum2);
		
		
		// 4. 1000의 약수들의 개수
		/*
		 * int sum4 = 0; 
		 * int num = 1000; 
		 * for(int i = 1; i <= num; i++) { 
		 * 	if(num % i ==0) { 
		 * 		sum4++; 
		 * 	} 
		 * } 
		 * System.out.println("1000의 약수들의 개수 " + sum4);
		 */
		int k = 1;
		int count = 0;
		while(k <= 1000) {
			if(1000 % k == 0) {
				count++;
			}
			k++;
		}
		System.out.println("합계 : " + count);
	}
}
