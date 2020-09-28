package regexvalidation;

import java.util.Scanner;
import regexvalidation.*;
public class Driver {

	public static void main(String args[]) {
		UserDetails userInfo = new UserDetails();
		RegexValidator regexValidator = new RegexValidator();
		Scanner sc = new Scanner(System.in);
		System.out.println("User Registration System!! Enter the details:");
		
		System.out.println("Enter the first name");
		 String fName = sc.nextLine().trim();		
		userInfo.setfName(fName);
		
		System.out.println("Enter the Last name");
		 String lName = sc.nextLine().trim();		
		userInfo.setlName(lName);
		
		System.out.println("Enter the EmailID");
		 String emailId = sc.nextLine().trim();		
		userInfo.setEmailID(emailId);
		
		System.out.println("Enter the Phone Number");
		 String phoneNum = sc.nextLine().trim();		
		userInfo.setPhoneNum(phoneNum);
		
		System.out.println("Enter the Password");
		 String passWord = sc.nextLine().trim();		
		userInfo.setPassWord(passWord);
		
		regexValidator.userValidator(userInfo);
	}
	
}
//output

//User Registration System!! Enter the details:

//Enter the first name
//hardik
//Enter the Last name
//Pachga
//Enter the EmailID
//abc..2002@gmail.com
//Enter the Phone Number
//1231231231
//Enter the Password
//apefs@13
//Invalid FirstName
//Valid LastName
//Invalid EmailID
//Invalid Phone Number
//INVALID PASSWORD: ENTER ATLEAST ONE UPPERCASE NAME
