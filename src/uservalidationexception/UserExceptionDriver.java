package uservalidationexception;

import java.util.Scanner;

import regexvalidation.UserDetails;

public class UserExceptionDriver {

	public static void main(String args[]) throws UserValidationException {

		UserDetails userInfo = new UserDetails();
		UserValidation userValidation = new UserValidation();
		Scanner sc = new Scanner(System.in);
		System.out.println("User Registration System!! Enter the details:");
		try {
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
			userValidation.userValidator(userInfo);

		} 
		catch (UserValidationException e) {
			System.out.println(e.getClass() + ", in :" + e.getMessage());
		}

	}
}
