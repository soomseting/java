package day08.super_.basic2;

public class Student extends Person {

	String studentId;

	public Student(String name, int age, String studentId) {
//		super(); 현재 생략되어 있는 상태
//		this.name = name;
//		this.age = age;
		super(name, age); //부모님이 가지고 있는 name, age에 한 번에 저장하겠다. //상속관계에서만 이렇게 할 수 있음
		this.studentId = studentId;
	}
	
	@Override //어노테이션 - 특정기능을 표현
	String info() {
//		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
		return super.info() + ", 학번:" + studentId;// 부모 메서드와 일치하는 부분을 이렇게 할 수도 있음.
	}
}
