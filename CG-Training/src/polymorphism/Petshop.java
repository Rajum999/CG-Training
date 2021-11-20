package polymorphism;

public class Petshop {

	public static void main(String[] args) {
		Animal obj = new Animal();
		obj.talk();
		System.out.println("************");
		
		Cat obj1 = new Cat();
		obj1.talk();
		System.out.println("*************");
		
		Animal obj2=new Cat();
		obj2.talk();
		

	}

}
