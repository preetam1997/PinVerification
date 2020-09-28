package pinValidation;

import java.util.Scanner;

public class PinValidation {
	
	public static void Pin_Validation(String s) {
		
		 
	      String regex = "^[0-9]{6}";
	     
	      boolean result = s.matches(regex);
	      if(result) {
	         System.out.println("Given pin is valid");
	      } else {
	         System.out.println("Given pin is not valid");
	      }
	   }
		
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your Pin: ");
	    String pin = sc.next();
	    sc.close();
	    
	    Pin_Validation(pin);
	}
}
