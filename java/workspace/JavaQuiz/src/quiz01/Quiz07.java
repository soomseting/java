package quiz01;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		/*
		 * 정수1> 5
		 * 연산자를 선택하세요[+,-,*,/]> *
		 * 정수2> 3
		 * 두 수의 곱셈은: 15
		 * 
		 * 잘못 입력하면
		 * 사칙연산 기호를 입력해 주세요.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1>");
		int a = sc.nextInt();
		
		System.out.print("연산을 선택하세요[+, -, *, /]>");
		String op = sc.next();
		
		System.out.print("정수2>");
		int b = sc.nextInt();
		
		switch (op) {
		case "+":
			System.out.println("두 수의 덧셈은:" + (a+b));
			break;
		case "-":
			System.out.println("두 수의 뺄셈은:" + (a-b));
			break;
		case "*":
			System.out.println("두 수의 곱셈은:" + (a*b));
			break;
		case "/":
			System.out.println("두 수의 나눗셈은:" + (a/b));
			break;
		default:
			System.out.println("사칙연산 기호를 입력해 주세요.");
			System.out.println("[+, -, *, /]");
			break;
		}
	}
}
