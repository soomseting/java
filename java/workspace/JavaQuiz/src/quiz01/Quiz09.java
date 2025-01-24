package quiz01;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 1;
		while(a <=9) {
			System.out.println(n + " * " + a + " = " + (a*n));
			a++;
		}
	}
}
