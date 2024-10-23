package Lab1;

public class Temperature {
	public enum Scale{
		C, F;
	}
	
	private double value;
	private char scale;
	
	public Temperature() {
		this.value = 0;
		this.scale = 'C';
	}
	
	public Temperature(double value) {
		this.value = value;
		this.scale = 'C';
	}
	
	public Temperature(char scale) {
		this.value = 0;
		this.scale = scale;
	}
	
	public Temperature(double value, char scale) {
		this.value = value;
		this.scale = scale;
	}
	
	public double toCelsius() {
		if (scale == 'C') {
			return value;
		}
		return 5*(value - 32)/9;
	}
	
	public double toFahrenheit() {
		if (scale == 'F') {
			return value;
		}
		return (9*(value/5))+32;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
		
	public void setScale(char scale) {
		if (scale == 'C' || scale == 'F') {
			this.scale = scale;
		} else {
			throw new IllegalArgumentException("Enter either 'C' or 'F'. ");
		}
	}
	
	public void setValueAndScale(double value, char scale) {
		this.value = value;
		setScale(scale);
	}
	
	public double getScale() {
		return scale;
	}
	
	public static void main(String args[]) {
		Temperature t1 = new Temperature();
		System.out.println("Temperature: " + t1.toCelsius() + " °C");
		System.out.println("Temperature: " + t1.toFahrenheit() + " °F");
		
		Temperature t2 = new Temperature(10);
		System.out.println("Temperature: " + t2.toCelsius() + " °C");
		System.out.println("Temperature: " + t2.toFahrenheit() + " °F");
		
		t2.setValue(30);
		System.out.println("Scale: " + t2.getScale());
		
		Temperature t3 = new Temperature('F');
		System.out.println("Temperature: " + t3.toCelsius() + " °C");
		System.out.println("Temperature: " + t3.toFahrenheit() + " °F");
		
		t3.setScale('C');
		System.out.println("Temperature: " + t3.toCelsius() + " °C");
		
		Temperature t4 = new Temperature(50, 'F');
		System.out.println("Temperature: " + t4.toCelsius() + " °C");
		System.out.println("Temperature: " + t4.toFahrenheit() + " °F");
		
		t4.setValueAndScale(100, 'C');
		System.out.println("Temperature: " + t4.toFahrenheit() + " °F");
		
	}
}
