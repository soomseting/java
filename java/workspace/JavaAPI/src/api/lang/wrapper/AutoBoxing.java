package api.lang.wrapper;

public class AutoBoxing {
	public static void main(String[] args) {
		
		//AutoBoxing - 기본타입을 자동으로 클래스형으로 변환 (반대도 가능)
		//기본타입 - 
		
		Integer val1 = 1; //String str = "...";
		Double val2 = 3.14;
		
		int a = val1;
		double b = val2;
		
		//래퍼 클래스는 유용한 기능들을 static 메서드로 제공해줍니다.
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int result1 = Integer.parseInt("3");
		double result2 = Double.parseDouble("3");
		long result3 = Long.parseLong("3");
		
		System.out.println(result1 + result2 + result3);
		
		
		
		
	}
}
