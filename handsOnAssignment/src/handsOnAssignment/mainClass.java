package handsOnAssignment;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		String firstName = null;
		String lastName = null;
		Scanner sc= new Scanner(System.in);
		try {
				
			System.out.println("Please enter your Name as.....First Name Last Name");
			String name[] = sc.nextLine().split(" ",2);
			firstName = name[0];
			lastName = name[1];
		} catch (Exception e) {
			System.out.println("Invalid Name.... Exiting Now");
		}
		if (firstName != null) {
			new Employee(firstName,lastName);
		}
		sc.close();
		
			}

}
