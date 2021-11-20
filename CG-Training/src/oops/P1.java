package oops;

public class P1 {

	public static void main(String[] args) {
		Singleton s= Singleton.getSingleton();
		Singleton s1= Singleton.getSingleton();
		System.out.println(s1.equals(s));

	}

}
