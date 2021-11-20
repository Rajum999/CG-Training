package oops;

public class IceCream extends DessertItem{
	public double rupees;

	public IceCream(double tax, double rupees) {
		super(tax);
		this.rupees = rupees;
	}

	@Override
	public void getCost() {
		double cost;
		System.out.println((cost=rupees+tax)+" is the price of icecream in rupees");
		
	}
	

}
