package basic;

import java.util.Scanner;

public class Validaton {

	public static void main(String[] args) {
		int count = 0;
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your user id");
		String userID = scanner.next();
		System.out.println("Enter your Password");
		String password = scanner.next();
		
		 String userId = "Nireekshan" ;
		 String password1 = "123456";
		 if(userId.equals(userID) && password1.equals(password)) {
			 System.out.println(userID+" your login is successful");
		 }
		 else {
			count++;
			if(count<4) {
				
			}
		 }

	}

}
