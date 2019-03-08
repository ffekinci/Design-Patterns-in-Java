package SingletonPattern;

public class SingleObject {

	private static SingleObject instance;
	
	private int number;

	private SingleObject() {
		//Empty
	}
	
	/*
	 * If you want to make it a thread-Safe, you can add "synchronized" parameter after static keyword.
	 */
	
	public static SingleObject getInstance() {
		if(instance == null)
			instance = new SingleObject();
		
		return instance;
	}
	
	//You can define/create a variable/method
	
	public void showMessage() {
		System.out.println("Hello World");

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
}
