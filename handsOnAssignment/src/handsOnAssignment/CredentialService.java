package handsOnAssignment;

import java.util.Random;

public class CredentialService {
	
	String generatePassword() {
			
		String lowerCaseAlphabet = "abcdefghijklmnopqrstuvwxyz";
		String capitalCaseAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String specialChar = "!@#$%^&_:";
		String numbers = "1234567890";
	    String allChars = capitalCaseAlphabet + lowerCaseAlphabet + specialChar + numbers;
	    char[] password = new char[7];
	    Random random = new Random();
	    password[0] = lowerCaseAlphabet.charAt(random.nextInt(25));
	    password[1] = capitalCaseAlphabet.charAt(random.nextInt(25));
        password[2] = specialChar.charAt(random.nextInt(specialChar.length())-1);
        password[3] = numbers.charAt(random.nextInt(numbers.length()-1));
		   
		      for(int i = 4; i< 7 ; i++) {
		         password[i] = allChars.charAt(random.nextInt(allChars.length()-1));
		      }
		      return password.toString();
	}
	
	String generateEmailAddress(String firstName,String lastName, int department) {
		String dep = null;
		switch(department) {
		case 1 : {dep ="tech";return firstName+lastName+"@"+dep+".abc.com";}
		case 2 : {dep ="admin";return firstName+lastName+"@"+dep+".abc.com";}
		case 3 : {dep ="HR";return firstName+lastName+"@"+dep+".abc.com";}
		case 4 : {dep ="legal";return firstName+lastName+"@"+dep+".abc.com";}
		default : return null;
		}
		}
	
	void showCredentials(String firstName, String email, String password) {
		
		System.out.println("Dear "+firstName+" your generated credentials are as follows");
		System.out.println("Email     ---> "+email);
		System.out.println("Password  ---> "+password);
	}
	
}
