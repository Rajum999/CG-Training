package oops;

public class FileDataBase {

	public static void main(String[] args) {
		Persistence per = new DatabasePersistance();
		per.persist();
		Persistence per1= new FilePersistance();
		per1.persist();
		Persistence per3 = new Persistence() {
			public void persist() {
			System.out.println("Overriding the persist from FiledataBase");
			}
		};
		per3.persist();
		
			
		
		

	}

}
