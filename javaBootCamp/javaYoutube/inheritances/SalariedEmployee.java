package inheritances;

public class SalariedEmployee extends Employee {

	int weeklySalary;

	public SalariedEmployee(String name, String tel, int weeklySalary) {
		super(name, tel);
		setWeeklySalary(weeklySalary);
	}

	public int getWeeklySalary() {
		return this.weeklySalary;
	}

	public void setWeeklySalary(int weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

}
