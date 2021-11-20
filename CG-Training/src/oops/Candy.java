package oops;

public class Candy extends DessertItem{
	public double priceInDoller;

	public Candy(double tax, double priceInDoller) {
		super(tax);
		this.priceInDoller = priceInDoller;
	}

	@Override
	public void getCost() {
		double price =0;
		double rupees =60;
		double a =priceInDoller/rupees;
		System.out.println((price=a+tax)+" is the price of the cany in dollers");
		
	}
	
	
	

}
