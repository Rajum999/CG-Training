package oops;

public class Savings {
	String accountantName;
	int accountNumber;
	double fixedDeposits;
	
	
	public Savings(String accountantName, int accountNumber, double fixedDeposits) {
		super();
		this.accountantName = accountantName;
		this.accountNumber = accountNumber;
		this.fixedDeposits = fixedDeposits;
	}


	public void totalCash() {
		double totalCash=fixedDeposits;
		System.out.println(totalCash);
	}

}
