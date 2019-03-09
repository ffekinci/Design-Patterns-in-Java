package FactoryPattern;

public class FactoryPatternDemo {
	
	/*
	 * Factory Design Pattern | Creational Pattern
	 * 
	 * We can create object without traditional method(Class class = new Class())
	 * Your code can be read easily	
	 * We can easily extend our code with add new class.
	 * Common features/method are defined interface thus programmer don't need know method should be used.
	 */

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("circle");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("square");
		shape3.draw();

	}

}
