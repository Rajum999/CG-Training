package oops;

public class Company {

	public static void main(String[] args) {
		Employee e = new Manager(123,"Nireekshan",10000.0,500.0);
		e.totalSal();
		Employee e1 = new Labour(456,"Raju",5000,500);
		e1.totalSal();
		System.out.println();
		 
	}

}
