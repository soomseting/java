package day01;

public class IdentifierEx {
	public static void main(String[] args) {//클래스는 앞글자 대문자
		int age = 10;
		int Age = 20;
		
		System.out.println(age);
		System.out.println(Age);// 대소문자 구분함
		
		int phonenumber = 3; //x
		int phoneNumber = 4; //o - 카멜 표기법
//		int phone number = 5; // 공백은 사용 x - 굳이 공백을 쓸거라면 _
		
//		int class = 10; //키워드는 이름을 지을 수 없음
//		int public = 20;
	}
}
