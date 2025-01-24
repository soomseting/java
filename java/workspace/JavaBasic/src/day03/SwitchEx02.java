package day03;

import java.util.Scanner;

public class SwitchEx02 {
	public static void main(String[] args) {
		
		//switch문장은 else if 문과 90% 유사함
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		switch (a / 10) { // switch문장에 소괄호에는 변수 or 변수의 연산식 들어갈 수 있음.
		case 9:
			if(a >= 95) {
				System.out.println("A+학점");
			}else {
				System.out.println("A학점");
			}
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		default:
			break;
		}
	}
}
