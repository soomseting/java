package quiz05;

public class Calculator {

	int result;
	double pi;
	
	Calculator(){
		result = 0;
		pi = 3.14;
	}
	
	
	void add(int a) {
		result += a;
		System.out.println(result);
	}
	void sub(int b) {
		result -= b;
		System.out.println(result);
	}
	void circle(int c) {
		System.out.println(pi * c * c);
	}
}
