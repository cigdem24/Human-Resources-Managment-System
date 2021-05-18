package inheritances;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		HourlyEmployee cigdemEmployee = new HourlyEmployee("Çiğdem", "123566", 50, 45);
		Employee zeynepEmployee = new SalariedEmployee("Zeynep", "56465", 600);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(zeynepEmployee);
		employees.add(cigdemEmployee);

		HourlyEmployeeManager employeeManager = new HourlyEmployeeManager();
		EmployeeManager employeeManager2 = new SalariedEmployeeManager();

		System.out.println(employeeManager.earnings(cigdemEmployee));

	}

}
