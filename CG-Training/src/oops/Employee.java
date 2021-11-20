package oops;

public class Employee {
	int empID;
	String name;
	 double sal;
	
	public Employee(int empID, String name, double sal) {
		super();
		this.empID = empID;
		this.name = name;
		this.sal = sal;
	}
	
	public void totalSal() {
		double totalSal = sal;
		System.out.println(totalSal);
	}
	

}
