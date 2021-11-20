package doubts;



import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Transaction {
	Trader trader;
	int year;
	int value;  

	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	public static void main(String[] args) {

		List<Transaction> transactions=Arrays.asList(
				new Transaction(new Trader("abc", "Hyderabad"), 1999, 500),
				new Transaction(new Trader("xyz", "Bangalore"), 2000, 5000),
				new Transaction(new Trader("aaa", "Vizag"), 2001, 4000),
				new Transaction(new Trader("bbb", "Tirupati"), 2002, 6000)
				);
	
	String traderStr = transactions.stream()
            .map(t -> t.getTrader().getName())
            .sorted()
            .reduce("", (n1, n2) -> n1 + n2);
    System.out.println(traderStr);
}
}
