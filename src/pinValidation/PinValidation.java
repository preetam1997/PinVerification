package pinValidation;

import java.util.Scanner;
import java.util.regex.*;

public class PinValidation {
	
	public static void Pin_Validation(String s) {
		
		 
	      String regex = "^([0-9]{3})(\\s)?([0-9]{3})$";
	     
	      boolean result = Pattern.matches(regex,s);
	      if(result) {
	         System.out.println("Given pin is valid");
	      } else {
	         System.out.println("Given pin is not valid");
	      }
	   }
		
		
	public static void main(String[] args) {
		
		
	    
	    Pin_Validation("400008");
	    Pin_Validation("400 008");
	}
}
