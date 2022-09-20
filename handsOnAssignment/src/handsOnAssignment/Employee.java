package handsOnAssignment;

import java.util.Scanner;

public class Employee {
	CredentialService cs = new CredentialService();
    public Employee() {
		super();
	}
    public Employee(String firstName, String lastName) {
    	Scanner sc= new Scanner(System.in);
    	
        int dep;
        String department = null;
		System.out.println("Please enter your Department");
		System.out.println("1.  Technical");
		System.out.println("2.  Admin");
		System.out.println("3.  Human Resource");
		System.out.println("4.  Legal");
		
		try {
			 department = sc.nextLine();
			 dep =Integer.parseInt(department);
			if (dep>4) {
				System.out.println("Please enter a valid department from 1 - 4 only");
				new Employee(firstName,lastName);
			}
			else {
				String email = cs.generateEmailAddress(firstName, lastName, dep);
		    	String password = cs.generatePassword();
		    	if(email == null) {
		    		System.out.println("Please enter Valid department from 1-4 only");
		    		 new Employee(firstName,lastName);
		    	}
		    	else 
		    		cs.showCredentials(firstName, email, password);
			}
			
						
		} catch (Exception e) {
			System.out.println("Please enter a valid department from 1 - 4 only");
			new Employee(firstName,lastName);
			
		}		

		sc.close();
    	
    }
}
