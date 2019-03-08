package StrategyPattern;

public class Pay {

	public static void main(String[] args) {
		
		/*
		 * Strategy Design Pattern | Behavioral Design Pattern
		 * If you use Strategy Design Pattern, it makes them interchangeable.
		 * Exp: You want to sort an array, at first you can insertion sort.
		 * 		If you don't like it, you can change easily sorting algorithm to the Merge or another one.
		 */
		
		PayWith(new CreditCardPayment("ffe", "123123123123", "123", "12/20"), 100);
		
		PayWith(new PaypalPayment("ffe@ffe.com", "123"), 75);
		
		PayWith(new MobilePayment("123123123", "1234"), 50);
		

	}
	
	public static void PayWith(PaymentStrategy paymentMethod, int amount) {
		paymentMethod.pay(amount);
	}

}
