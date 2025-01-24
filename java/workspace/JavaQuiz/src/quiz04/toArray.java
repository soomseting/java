package quiz04;

import java.util.Arrays;

public class toArray {
	private toArray() {
		// TODO Auto-generated constructor stub
	}
	public static void toArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
			System.out.print(a[i] + " ");
		}
		System.out.println("\n");
	}

	public static void toArray(char[] c) {
		String str = "";
		for(int a = 0; a<c.length;a++) {
			str += a;
			c[a] += str.charAt(a);
		}
		System.out.println(Arrays.toString(c));
	}

	public static void toArray(String[] str) {
		String str2 = "";
		for (int i = 0; i < str.length; i++) {
			str2 += i;
			str[i] = str2;
		}
		System.out.print(Arrays.toString(str));
	}
}
