package quiz05;

public class Computer extends Calculator {

	@Override
	void circle(int c) {
		System.out.println(Math.PI * c * c);
	}

	void rect(double a) {
		result = (int) (a * a);
		System.out.println(a + " x " + a + " = " + result);
	}

	void rect(double a, double b) {
		result = (int) (a * b);
		System.out.println(a + " x " + b + " = " + result);
	}

	void rect(double a, double b, double c) {
		result = (int) (a * b * c);
		System.out.println(a + " x " + b + " x " + c + " = " + result);
	}
}
