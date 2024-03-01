package employee;

public class Employee {

	
	private int emp_id;
	private String name;
	private double salary;
	public Employee() {
		
	}
	
	Employee( int emp_id,double salary, String name){
		
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
	}
	public int getEmp_id() {   //get variable name
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
}
