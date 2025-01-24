package day08.super_.basic1;

//public class Parent extends Object{
	public class Parent { // Object의 상속문을 안써도 자동 생략
	String father;
	String mother;
	
	public Parent(String father, String mother) {
		this.father = father;
		this.mother = mother;
		
	}
	
	void info() {
		System.out.println("아버지: " + this.father );
		System.out.println("어머니: " + this.mother);
	}
}
