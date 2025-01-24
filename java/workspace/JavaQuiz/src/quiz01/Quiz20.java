package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz20 {
	public static void main(String[] args) {
		// 백준 - 10818번 - 최소, 최대
		Scanner sc = new Scanner(System.in);
		int[] n = new int[sc.nextInt()];

		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		int max = n[0];
		int min = n[0];
		for (int i = 0; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];
			}
			if (min > n[i]) {
				min = n[i];
			}
		}
		System.out.println(min + " " + max);
		
		
	}
}
