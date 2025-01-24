package quiz02;

public class AccountMain {
	public static void main(String[] args) {
		Account ac = new Account("홍길동","aaaa",100000);
		//입금 전 잔액
		ac.getBalance();
		
		//입금 후 잔액
		ac.deposit(50000);
		ac.getBalance();
		
		//출금 실패 후 잔액
		ac.withDraw(25000);
		ac.getBalance();
		
		//출금 후 잔액
		ac.withDraw(25000);
		ac.getBalance();
		
		//최종 잔액
		System.out.println("최종잔액");
		ac.getBalance();
	}
}
