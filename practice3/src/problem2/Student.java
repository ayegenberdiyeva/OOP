package problem2;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String program, int year, double fee) {
		super(name);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	public String getProgram() {
		return program;
	}
	
	public void setProgram(String newProgram) {
		program = newProgram;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int newYear) {
		year = newYear;
	}

	public double getFee() {
		return fee;
	}
	
	public void setFee(double newFee) {
		fee = newFee;
	}
	
	public String toString() {
		return "Student{" +
				super.toString() +
				", program=" + program +
				", year=" + year +
				", fee=" + fee +
				'}';
	}
}
