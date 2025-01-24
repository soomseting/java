package quiz01;

import java.util.Arrays;

public class MethodQuiz01 {
	public static void main(String[] args) {
		/*
		 * 
		 *메서드명  반환유형	매개변수			기능
		 * method1 x 		x 				"안녕"출력
		 * method2 String	String			"전달 받은 매개 변수 리턴"
		 * method3 ?		int,int,double	"세 매개변수 합 리턴"
		 * method4 String	int				"매개 변수가 짝수면 "짝수",홀수라면 "홀수" 리턴
		 * method5 x 		String,int		"매개 변수 int만큼 String 반복 출력"
		 * maxNum  ?		?				"매개 변수 2개를 입력받아 큰 수 리턴"
		 * abs	   ?		int				"절대값 리턴"
		 * method6	String	char[]			"char배열 요소를 문자열로 모두 붙여서 리턴"
		 * method7	int		int[]			"배열의 요소의 합을 리턴"
		 */
		
		
		//1
		System.out.print("1번:");
		method1();
		System.out.println("--------------------");
		//2
		System.out.println("2번:"+method2("하이요"));
		System.out.println("--------------------");
		//3
		System.out.println("3번:"+method3(1,2,3.0));
		System.out.println("--------------------");
		//4
		System.out.println("4번:");
		System.out.println(method4(2));
		System.out.println(method4(3));		
		System.out.println("--------------------");
		//5
		System.out.println("5번:");
		method5("출력할게요", 5);
		System.out.println("--------------------");
		//6
		System.out.println("6번:");
		System.out.println(maxNum(5,8));
		System.out.println(maxNum(13,7));
		System.out.println("--------------------");
		//7
		System.out.println("7번:");
		System.out.println(abs(5));
		System.out.println(abs(-13));
		System.out.println("--------------------");
		//8
		char[] a = {'a','b','c'};
		System.out.println("8번:");
		System.out.println(method6(a));
		System.out.println("--------------------");
		//9
		System.out.println("9번:");
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(method7(arr));
		
		//10
		System.out.println("10번:");
		String[] arr3 = method8( "홍길동", "이순신");
		System.out.println(Arrays.toString(arr3));
	}
	
	
	
	
	
	
	//1
	static void method1() {
		System.out.println("안녕");
	}
	//2
	static String method2(String a) {
		String str = a;
		return str;
	}
	//3
	static double method3(int a, int b ,double c) {
		double sum = 0;
		sum = a + b + c;
		return sum;
	}
	//4
	static String method4(int a) {
		//return a % 2 == 0 ? "짝수" : "홀수";
		String result ="";
		if(a % 2 == 0) {
			result = "짝수";
			//return "짝수";
		}else {
			result = "홀수";
			//return "홀수";
		}
		return result;
	}
	//5
	static void method5(String a, int b) {
		for(int i = 0; i< b; i++) {
			System.out.println(a);
		}
	}
	//6
	static int maxNum(int a, int b) {
		int max = 0;
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
	//7
	static int abs(int a) {
		//return a < 0 ? -a : a;
		int result = 0;
		if(a < 0 ) {
			result = -a;
		}else {
			result = a;
		}
		return result;
	}
	//8
	static String method6(char[] a) {
		String str = "";
		for(int i = 0;i< a.length; i++) {
			str += a[i];
		}
		return str;
	}
	//9
	static int method7(int[] a) {
		int sum = 0;
		for(int i = 0; i< a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}

	//10
	static String[] method8(String a, String b) {
		String[] arr = {a, b};
		return arr;
	}


}
