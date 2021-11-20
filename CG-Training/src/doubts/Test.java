package doubts;

import java.util.ArrayList;
import java.util.function.*;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<>();
		a.add(new Employee("Raju",2000.0));
		a.add(new Employee("Jojo",3000.0));
		a.add(new Employee("Madara",5000.0));
		a.add(new Employee("Sukuna",1000.0));
		a.add(new Employee("Neko",8000.0));
		Predicate<Employee> p = e->e.sal>3000;
		for(Employee e1:a) {
			if(p.test(e1)) {
				System.out.println(e1.name + " " + e1.sal);
			}
		}

	}

}
