package casting;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		List <Employee> emp = new ArrayList<>();
		emp.add( new FullTimeEmployee("John", 123, 9232));//120.016
		emp.add( new FullTimeEmployee("Kate", 124, 10000));
		emp.add( new FullTimeEmployee("Anna", 125, 7693));
		emp.add( new HourlyEmployee("Ralph", 126, 50, 6)); //109.200
		emp.add( new HourlyEmployee("Lauren", 127, 55, 8));
		emp.add( new HourlyEmployee("Jane", 128, 60, 8));
		
		for (Employee e : emp) {
			double yearlyIncome = 0;
			System.out.println(e.getName());
			e.getPaid();
			if(e instanceof FullTimeEmployee) {
				FullTimeEmployee ft = (FullTimeEmployee) e;
				yearlyIncome = ft.calculateYearlyIncome();
			}else if(e instanceof HourlyEmployee) {
				HourlyEmployee he = (HourlyEmployee) e;
				yearlyIncome = he.calculateYearlyWage();
			}
			System.out.println(yearlyIncome);
		}
	}
}

abstract class Employee{
	String name;
	int id;
	
	public Employee() {
		this("Unknown", 000);
	}
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	abstract void getPaid();

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	public final void displayEmployeePolicy() {
		
	}
	
	public static void showEmployeeManual() {
		
	}
}

class FullTimeEmployee extends Employee{
	
	double salary;
	
	public FullTimeEmployee(String name, int id, double salary){
		super(name, id);
		this.salary = salary;
	}
	
	@Override
	void getPaid() {
		double payment = 0;
		double yearly = calculateYearlyIncome();
		payment = (yearly/52)*2;
		System.out.println("payment= " + payment);
	}

	public double getSalary() {
		return salary;
	}
	
	public static void showEmployeeManual() {
		
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [salary=" + salary + ", name=" + name + ", id=" + id + "]";
	}
	
	public double calculateYearlyIncome() {
		
		return (salary/4)*52;
	}
}

class HourlyEmployee extends Employee{

	double wage;
	int hours;
	
	public HourlyEmployee(String name, int id, double wage, int hours) {
		super (name, id);
		this.wage = wage;
		this.hours = hours;
	}
	
	@Override
	void getPaid() {		
		double payment = 0;
		double yearly = calculateYearlyWage();
		payment = (yearly/52)*2;
		System.out.println("payment= " + payment);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + ", name=" + name + ", id=" + id + "]";
	}	
	
	public double calculateYearlyWage() {
		
		return ((wage*hours)*7)*52;
	}
	
	public static void showEmployeeManual() {
		
	}
	
}