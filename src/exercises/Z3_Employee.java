package exercises;

public class Z3_Employee {

	private String name;
	private long employeeID;
	private double salary;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}
	
	public long getEmployeeID() {
		return employeeID;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String toString () {
		return "Employee[name: " + name + "  employeeID: " + employeeID + "  salary: " + salary + "]";
	}
}
