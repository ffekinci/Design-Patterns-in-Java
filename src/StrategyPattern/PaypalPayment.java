package StrategyPattern;

public class PaypalPayment implements PaymentStrategy{
	
	String mail;
	String password;

	public PaypalPayment(String mail, String password) {
		this.mail = mail;
		this.password = password;
	}


	@Override
	public void pay(int amount) {
		
		System.out.println(amount + " paid with Paypal.");
		
	}
	
	

}
