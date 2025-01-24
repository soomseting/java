package quiz02;

import java.util.Scanner;

public class Account {
	/*
	 * Account클래스
	 * 
	 * 멤버변수 이름 - String 비밀번호 - String 잔액 - int
	 * 
	 * 생성자 (이름, 비밀번호, 잔액) 을 받아서 초기화 해주는 생성자 1개
	 * 
	 * 메서드 입금기능 - deposit(int) : 반환 void - 잔액에 매개변수를 누적하는 기능 출금기능 - withDraw(int) :
	 * 반환 int - 사용자에게 비밀번호를 입력받아서, 비밀번호가 일치하면, 잔액을 차감해하고, 출금값을 반환하는 기능 문자열의 비교
	 * "문자열".equals("문자열") 잔액조회 - getBalance() : 반환 int - 잔액을 반환하는 기능
	 * 
	 * 잔액조회 - getBalance() : 반환 int - 잔액을 반환하는 기능
	 * 
	 */
	String name;
	String pw;
	int money;

	Account(String Uname, String Upw, int Umoney) {
		name = Uname;
		pw = Upw;
		money = Umoney;
	}

	// 입금부
	void deposit(int a) {
		System.out.println(a + "원 입금");
		money += a;
	}

	// 출금부
	int withDraw(int a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호를 입력해주세요");
		String checkPw = sc.next();
		if (pw.equals(checkPw)) {
			money -= a;
			return a;
		}else {
			System.out.println("비밀번호가 일치하지 않아 출금에 실패했습니다.");
		}
		return 0;
	}

	// 조회부
	int getBalance() {
		System.out.println("-----------------------");
		System.out.println("잔액 : " + money);
		return money;
	}
}
