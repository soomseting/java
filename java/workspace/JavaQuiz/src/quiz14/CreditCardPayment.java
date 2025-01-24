package quiz14;

public class CreditCardPayment implements Payment {

	@Override
	public void pay(int amount) {
		System.out.println("신용카드로 " + amount + "원을 결제합니다.");

	}

	@Override
	public boolean validatePaymentDetails(String details) {
		String detail = "1231231231231231";
		System.out.println("카드 번호 형식 대조 결과: " + (details.length() == 16 ? true : false) );
		return details.length() == 16 ? true : false;
	}

}
