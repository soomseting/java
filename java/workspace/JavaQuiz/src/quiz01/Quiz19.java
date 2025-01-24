package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		//백준 - 배열 x보다 작은 수
		
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[sc.nextInt()];
		
		int x = sc.nextInt();
		for(int i = 0; i<n.length; i++) {
			int z = sc.nextInt();
			n[i] += z;
			if(x > n[i]) {
				System.out.print(n[i] + " ");
			}
		}
		
		
	}
}
