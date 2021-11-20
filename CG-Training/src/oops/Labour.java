package oops;

public class Labour extends Employee{
	double overTime;

	public Labour(int empID, String name, double sal, double overTime) {
		super(empID, name, sal);
		this.overTime = overTime;
	}
	
	public void totalSal() {
		double totalSal =sal+overTime;
		System.out.println("Total salary of Labour :"+totalSal);
	}

}
