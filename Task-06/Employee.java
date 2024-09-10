package task_6;

public class Employee {
	
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(String firstName, String lastName, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
}   
	public String getfirstName() {
	    return firstName;
}  
	public void setfirstName(String firstName) {
        this.firstName = firstName;
}   
	public String getlastName() {
	    return lastName;
}   
	public void setlastName(String lastName) {
	    this.lastName = lastName;
}   
	public double getSalary() {
	    return salary;
}   
	public void setSalary(double salary) {
	    this.salary = salary;
}   
	public void raiseSalary(double percentage) {
	    salary = salary + ((salary * percentage) / 100);
}   
	public void printEmployeeDetails() {
	    System.out.println("First Name : "+ firstName);
	    System.out.println("Last Name : "+ lastName);
	    System.out.println("Salary : "+salary);
}
}
