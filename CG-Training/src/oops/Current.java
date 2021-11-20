package oops;

public class Current extends Savings {

	double cashCredit;

	public Current(String accountantName, int accountNumber, double fixedDeposits, double cashCredit) {
		super(accountantName, accountNumber, fixedDeposits);
		this.cashCredit = cashCredit;
	}

	public void totalCash() {
		double totalCash = fixedDeposits + cashCredit;
		System.out.println(totalCash);
	}

	public static void main(String[] args) {

		Savings s = new Current("Nireekshan", 987654321, 5000, 5000);
		s.totalCash();

	}

}
