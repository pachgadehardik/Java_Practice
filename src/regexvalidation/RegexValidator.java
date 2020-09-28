package regexvalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import regexvalidation.*;
public class RegexValidator {
	
	
	final static String uc1 = "^[A-Z]{1}[A-Za-z]{2,}";    //USECASE 1 FirstNAme
	final static String uc2 = "^[A-Z]{1}[A-Za-z]{2,}";	//USECASE 2 LASTNAME

	final static String uc3 = "^[\\w]+([\\. | \\- | \\+]{1}[\\w]+)*(@){1}[a-zA-Z]+\\.[a-zA-Z]{2,3}?(\\.[A-Za-z]{2,3})$"; //USECASE 3 EMAILID
	final static String uc4 = "^[0-9]{0,2}[\\s][1-9]{1}[0-9]{9}"; //USECASE4 PHONE NUMBER
	
	final static String uc5 = "^.{8,}";	//Min length is 8
	final static String uc6 = "^.*[A-Z]{1,}.*"; //Min One Upper Case Character 
	final static String uc7 = "^.*[0-9]{1,}.*"; //Min one Dgit
	final static String uc8 = "^[A-Za-z0-9]*[^0-9a-zA-Z]{1}[A-Za-z0-9]*"; //Only One Special Character
	
	public static boolean checkRegex(String regex, String input) {
			

			Matcher matcher = Pattern.compile(regex).matcher(input);
			
			if(matcher.matches()) 
				return true;
			return false;
			
		}
	
	public void userValidator(UserDetails userDetails) {
		if(checkRegex(uc1, userDetails.getfName()) != true) System.out.println("Invalid FirstName");
		else System.out.println("Valid FIrstName");
		
		if(checkRegex(uc2, userDetails.getlName()) != true) System.out.println("Invalid Last Name");
		else System.out.println("Valid LastName");
		
		
		
		
		if(checkRegex(uc3, userDetails.getEmailID()) != true) System.out.println("Invalid EmailID");
		else System.out.println("Valid EmailId!!");
		
		if(checkRegex(uc4, userDetails.getPhoneNum()) != true) System.out.println("Invalid Phone Number");
		else System.out.println("Valid Phonenumber!!");
		
		String pw = userDetails.getPassWord();
		if(checkRegex(uc5,pw) == true) {
			if(checkRegex(uc6, pw) == true) {
				if(checkRegex(uc7, pw) == true) {
					if(checkRegex(uc8, pw) == true) {
						System.out.println("Valid Password!!");
					}
					else System.out.println("Invalid Password: Enter only ONE SPECIAL CHAR");
				}
				else {
					System.out.println("INVALID PASSWORD: ENter atleast Digit");
				}
			}
			else {
				System.out.println("INVALID PASSWORD: ENTER ATLEAST ONE UPPERCASE NAME");
			}
		}
		else {
			System.out.println("INVALID PASSWORD: LENGTH SHOULD BE MORE THAN 8!!");
		}
			
	}
	
}
