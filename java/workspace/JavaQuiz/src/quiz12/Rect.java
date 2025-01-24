package quiz12;

public class Rect extends Shape {
	private int a;
	
	public Rect(String name, int a) {
		super(name);
		this.a = a;
	}
	// 사각형은 생성될 때 이름과, 변의 길이를 받도록 처리하고,
	// getArea()는 사각형의 넓이를 계산하도록 오버라이딩 처리
	// main에서 확인

	@Override
	public double getArea() {
//		System.out.println(a * a);
		return a*a;
	}

}
