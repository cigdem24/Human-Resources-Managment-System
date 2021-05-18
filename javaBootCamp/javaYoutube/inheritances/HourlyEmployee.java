package inheritances;

public class HourlyEmployee extends Employee {

	private double wage;
	private int hours;

	public HourlyEmployee(String name, String tel, double wage, int hours) {
		super(name, tel);
		setWage(wage);
		setHours(hours);

	}

	public double getWage() {
		return this.wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getHours() {
		return this.hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

}
