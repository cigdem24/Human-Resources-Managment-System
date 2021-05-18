package inheritances;

public class HourlyEmployeeManager extends EmployeeManager {

	public double earnings(HourlyEmployee hourlyEmployee) {

		if (hourlyEmployee.getHours() < 40) {
			return hourlyEmployee.getWage() * hourlyEmployee.getHours();
		} else {
			return hourlyEmployee.getWage() * hourlyEmployee.getHours() * 10;
		}

	}

}
