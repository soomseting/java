package quiz01;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		/*
		 * 어떤 수 1개를 입력받습니다.
		 * 이 숫자가 홀수, 짝수, 0, 음수 인지를 구분해서 출력.
		 */
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0) {
			if(a%2 == 0) {
				System.out.println("이놈은 짝수여");
			}else {
				System.out.println("이놈은 홀수여");
			}
		}else if(a<0) {
			System.out.println("이놈은 음수여");
		}else {
			System.out.println("이놈은 0이여");
		}
	}
}
