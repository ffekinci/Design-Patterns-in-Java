package FactoryPattern;

public class ShapeFactory {
	
	//get Shape method to generate of Object of type shape
	public Shape getShape(String shapeName) {
		if(shapeName.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		else if(shapeName.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		else if(shapeName.equalsIgnoreCase("Square")) {
			return new Square();
		}
		else
			return null;
	}

}
