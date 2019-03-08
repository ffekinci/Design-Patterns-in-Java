package SingletonPattern;

public class SingletonDemo {

	public static void main(String[] args) {
		
		
		/*
		 * Singleton Design Pattern | Creational Pattern
		 * 
		 * We use it when if we need only one object.
		 * Exp: If you have a Database class, you can write connect database code in constructor  
		 * Because you need connect to the database only one time. You don't need reconnect again.
		 * 
		 * You can't create a Object in that way. Because constructor is private, you can't access other classes.
		 * SingleObject test = new SingleObject();
		 * 
		 */
		
		SingleObject single = SingleObject.getInstance();
		
		single.showMessage();
		
		single.setNumber(10);
		int receivedNumber = single.getNumber();
		System.out.println(receivedNumber);

		// We will see same number because only one object defined. !!! (other == single)
		SingleObject other = SingleObject.getInstance();
		receivedNumber = other.getNumber();
		System.out.println(receivedNumber);
	}

}
