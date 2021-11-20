package oops;

public class Manager extends Employee{

	double incentive;

	public Manager(int empID, String name, double sal, double incentive) {
		super(empID, name, sal);
		this.incentive = incentive;
	}
	
	public void totalSal() {
		double totalSal = sal+ incentive;
		System.out.println("Total salary of Manager :"+totalSal);
	}
	

}
