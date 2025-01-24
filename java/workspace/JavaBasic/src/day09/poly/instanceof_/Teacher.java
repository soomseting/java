package day09.poly.instanceof_;

public class Teacher extends Person {

	String subject;

	Teacher(String name, int age, String subject) {
//		this.name = name;
//		this.age = age;
//		this.subject = subject;
		super(name,age);
		this.subject = subject;
	}
	
	String info() {
		return super.info() + ", 과목:" + subject;
	}
	
}
