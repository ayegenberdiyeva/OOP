package problem2;

public class Staff extends Person{
	private String school;
	private double pay;
	
	public Staff(String name, String school, double pay) {
		super(name);
		this.school = school;
		this.pay = pay;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String newSchool) {
		school = newSchool;
	}
	
	public double getPay() {
		return pay;
	}
	
	public void setPay(double newPay) {
		pay = newPay;
	}
	
	public String toString() {
		return "Staff{" +
				super.toString() +
				", school=" + school +
				", pay=" + pay +
				'}';
	}
}
