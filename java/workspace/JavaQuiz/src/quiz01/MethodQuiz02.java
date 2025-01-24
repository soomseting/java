package quiz01;

public class MethodQuiz02 {
	public static void main(String[] args) {

		String str = java(5);
//		System.out.println(str);
		System.out.println(java(1));
		System.out.println(java(2));
		System.out.println(java(3));
		System.out.println(java(4));
	}

	static String java(int a) {
//		String[] str = new String[a];
//		String result = "";
//		for (int i = 0; i < a; i++) {
//			if (i % 2 == 0) {
//				str[i] += "자";
//			} else {
//				str[i] += "바";
//			}
//			result += str[i];
//		}
		
		String result = "";
		for(int i = 0; i< a; i++) {
			if(i%2 == 0) {
				result += "자";
			}else {
				result += "바";
			}
		}
		return result;
	}
}
