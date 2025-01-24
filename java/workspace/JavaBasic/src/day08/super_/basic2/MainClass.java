package day08.super_.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 20, "123456");
		System.out.println(s.info());
		
		//teacher, Employee도 생성자를 만들고, 객체 생성 해주세요
		Employee e = new Employee("김누구",24,"어디부서");
		System.out.println(e.info());
		
		Teacher t = new Teacher("김선생",25,"수학");
		System.out.println(t.info());
	}
}
