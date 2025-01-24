package quiz01;

import java.util.Scanner;

public class Quiz24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 백준 27866 - 문자와 문자열
		String str = sc.next();
		int ii = sc.nextInt() - 1;
		System.out.println(str.charAt(ii));

		// 백준 9086 - 문자열
//		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] arr = new String[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
			System.out.print(arr[i].charAt(0));
			System.out.print(arr[i].charAt(arr[i].length() - 1) + "\n");
		}
		// 백준 11720 - 숫자의 합
		// 0의 ASCII 코드 값은 48 9의 ASCII 코드 값은 57
		// 숫자를 몇 개 입력할 건지 정한다.
		int a3 = sc.nextInt();
		int sum = 0;
		String str3 = sc.next();
		for (int i3 = 0; i3 < str3.length(); i3++) {
			sum += str.charAt(i3) - 48;

		}
		System.out.println(sum);
	}
}
