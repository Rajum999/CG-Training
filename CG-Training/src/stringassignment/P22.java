package stringassignment;

public class P22 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("It is used to at the specified index position");
		System.out.println("//** By using the string builder **//");
		System.out.println("Before insertion "+sb);
		sb.insert(14, "insert text ");
		System.out.println("After the insertrion "+ sb);

	}

}
