package Lab1;

public class Car {
	public enum CarType{
		SEDAN, SUV, TRUCK
	}
	
	private static final int DefaultWarrantyYears = 3;
	private static final double BasePrice = 20000.0;
	
	private final String model;
	private final CarType type;
	
	private double price;
	private int warrantyYears;
	
	{
		warrantyYears = DefaultWarrantyYears;
		price = BasePrice;
	}
	
	public Car(String model, CarType type) {
		this.model = model;
		this.type = type;
	}
	
	public Car(String model, CarType type, double price) {
		this(model, type);
		this.price = price;
	}
	
	public void configure(String color) {
		System.out.println("Configuring car: " + this.model + " as " + color + ".");
	}
	
	public String getModel() {
		return model;
	}
	
	public double getPrice() {
		return price;
	}
	
	public static int getDefaultWarrantyYears() {
		return DefaultWarrantyYears;
	}
	
	public void showDetails() {
		System.out.println("Car model: " + this.model);
		System.out.println("Car type: " + this.type);
		System.out.println("Price: " + this.price + "$");
		System.out.println("Warranty: " + this.warrantyYears + " years");
	}
	
	public static void main(String args[]) {
		Car car1 = new Car("Model A", CarType.SEDAN);
		car1.configure("White");
		car1.showDetails();
	}
}
