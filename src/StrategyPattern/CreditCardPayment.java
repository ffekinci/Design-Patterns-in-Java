package StrategyPattern;

public class CreditCardPayment implements PaymentStrategy {
	
	String name;
	String cardNumber;
	String ccv;
	String expirationDate;
	
	
	public CreditCardPayment(String name, String cardNumber, String ccv, String expirationDate) {
		this.name = name;
		this.cardNumber = cardNumber;
		this.ccv = ccv;
		this.expirationDate = expirationDate;
	}


	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid with credit card.");	
	}
	

}
