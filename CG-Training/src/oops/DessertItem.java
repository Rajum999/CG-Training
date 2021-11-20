package oops;

public abstract class DessertItem {
	public double tax;

	public DessertItem(double tax) {
		super();
		this.tax = tax;
	}
	public abstract void getCost();

}
