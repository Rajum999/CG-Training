package oops;

public class Singleton {
	
	private static Singleton single = null;
	 int i;
	 int j;
	 
	 private Singleton() {
		super();
		this.i = 10;
		this.j = 10;
	}
	 public static Singleton getSingleton() {
		 if(single == null) {
			 single = new Singleton();
		 }
		 return single;
		 
	 }
	 

}
