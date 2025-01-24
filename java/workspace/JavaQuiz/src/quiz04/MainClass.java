/*package quiz04;

public class MainClass {
	/*
	 * 1번 과제
	 * 
	 * Arrays.toString()와 똑같은 기능 구현하기 
	 * 1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드 
	 * 2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading 
	 * 2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading
	 *//*
	static int[] a = new int[5];
	static char[] c = new char[5];
	static String[] s = new String[5];
	public static void main(String[] args) {
		toArray to = new toArray();
		to.toArray(a);
		to.toArray(c);
		to.toArray(s);
		
	}
}
*/
package quiz04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		/*
		Arrays.toString()와 똑같은 기능 구현하기
		
		1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드
		2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading
		2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading
		*/
		
		int[] arr = {1,2,3,4,5};
		char[] arr2 = {'a','b','c'};
		String[] arr3 = {"d", "e", "f"};
	
//		ArrayPrint ap = new ArrayPrint();
//		System.out.println(ap.toArray(arr));
		
		System.out.println(ArrayPrint.toArray(arr));
		System.out.println(ArrayPrint.toArray(arr2));
		System.out.println(ArrayPrint.toArray(arr3));
		
		
	}
}
