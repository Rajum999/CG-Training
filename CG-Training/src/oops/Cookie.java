package oops;

public class Cookie extends DessertItem{
	double priceInEuro;

	public Cookie(double tax, double priceInEuro) {
		super(tax);
		this.priceInEuro = priceInEuro;
	}

	@Override
	public void getCost() {
		double cost;
		double rupees =70;
		double a= priceInEuro/rupees;
		System.out.println((cost = a+tax)+" is the price of the cookie in Euro");
		
	}
	

}
