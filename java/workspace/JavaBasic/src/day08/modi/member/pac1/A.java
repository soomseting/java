package day08.modi.member.pac1;

public class A {

	public A(int i) {}
	A(String s) {}
	private A(boolean b) {}//밖에서 객체 생성을 못하게 할 때. 생성자 private
	/*********************************************************/
	
	public int a;
	int b;
	private int c;
	
	public A() {
		a = 1;
		b = 2;
		c = 3;
		method1();
		method2();
		method3();
	} // 생성자
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	
	
	
	
	
	
	
	
	
}
