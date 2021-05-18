package inheritances;

public class SalariedEmployeeManager extends EmployeeManager {

	SalariedEmployee salariedEmployee;

	public double earnings(Employee employee) {
		salariedEmployee = (SalariedEmployee) employee;
		return salariedEmployee.getWeeklySalary() * 3.7;
	}

}
