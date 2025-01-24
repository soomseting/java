package quiz14;

public class PayPalPayment implements Payment{
	private String pin = "1234";
	@Override
	public void pay(int amount) {
		System.out.println("PayPal로" + amount+"원을 결제합니다");
	}

	@Override
	public boolean validatePaymentDetails(String details) {

		System.out.println("PIN 번호 대조 결과: " + (pin.equals(details) ? true : false));
		return pin.equals(details) ? true : false;
	}

}
