package StrategyPattern;

public class MobilePayment implements PaymentStrategy {
	
	String number;
	String verifyCode;
	
	public MobilePayment(String number, String verifyCode) {
		this.number = number;
		this.verifyCode = verifyCode;
	}

	@Override
	public void pay(int amount) {

		System.out.println(amount + " paid with mobile payment.");
		
	}
	
	

}
