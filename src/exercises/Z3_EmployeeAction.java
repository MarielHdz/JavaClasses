package exercises;

public class Z3_EmployeeAction {
	
	public static void main (String[] args) {

	Z3_Employee emp1 = new Z3_Employee();
	Z3_Employee emp2 = new Z3_Employee();
	
	emp1.setName("Alan");
	emp1.setEmployeeID(1234);
	emp1.setSalary(100000);
	
	emp2.setName("Bert");
	emp2.setEmployeeID(1235);
	emp2.setSalary(110000);
	
	String infoEmp1 = emp1.toString();
	String infoEmp2 = emp2.toString();
	
	System.out.println(infoEmp1);
	System.out.println(infoEmp2);

	}
}
