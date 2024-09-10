package task_6;

public class Main_Employee {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Hariharasuthan", "M", 40000);
		
		System.out.println("\nEmployee Details :- ");
		employee.printEmployeeDetails();
		employee.raiseSalary(15);
		
		System.out.println("\nAfter raising Salary is : ");
		System.out.println("\n15% for 'Hariharasuthan M' : ");
		employee.printEmployeeDetails();
	}
}
