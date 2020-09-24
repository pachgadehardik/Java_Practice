import java.util.*;

public class EmployeeWageComputation {
	// Constant Variables
	final static int Is_Full_Time = 1;
	final static int Is_Part_Time = 2;
	final static int Emp_Rate_per_hr = 20;
	final static int Number_of_Working_Days = 20;
	final static int Max_Working_Hrs = 100;

	public static void uc1() {
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		if (empCheck == Is_Full_Time) {
			System.out.println("Employee is Present");

		} else {
			System.out.println("Employee is absent");
		}
	}

	public static void uc2() {
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
		int empHrs, empWage = 0;
		if (empCheck == Is_Full_Time) {
			empHrs = 8;
		} else {
			empHrs = 0;
		}
		empWage = empHrs * Emp_Rate_per_hr;
		System.out.println("Employee Wage is: " + empWage);
	}

	public static void uc3() {
		int empHrs, empWage = 0;
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		if (empCheck == Is_Part_Time) {
			System.out.println("EMployee is PArt timer");
			empHrs = 4;
		} else if (empCheck == Is_Full_Time) {
			empHrs = 8;
		} else {
			empHrs = 0;

		}
		empWage = empHrs * Emp_Rate_per_hr;
		System.out.println("Employee Wage is: " + empWage);
	}

	public static void uc4() {
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		int empHrs, empWage = 0;
		switch (empCheck) {
		case Is_Part_Time:
			empHrs = 4;
			break;
		case Is_Full_Time:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * Emp_Rate_per_hr;

		System.out.println("Employee Wages is : " + empWage);
	}

	public static void uc5() {

		int empHrs, empWage, totalWage = 0;
		int c1 = 0, c2 = 0, c3 = 0;
		for (int i = 0; i < Number_of_Working_Days; i++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case Is_Part_Time:
				empHrs = 4;
				c1++;
				break;
			case Is_Full_Time:
				empHrs = 8;
				c2++;
				break;
			default:
				c3++;
				empHrs = 0;
			}
			empWage = empHrs * Emp_Rate_per_hr;
			totalWage += empWage;
		}
		System.out.println("Total days employee present part time: " + c1);
		System.out.println("Total days employee present full time: " + c2);
		System.out.println("Total days employee absent: " + c3);

		System.out.println("Total Monthly Employee Wage is: " + totalWage);
	}

	public static void uc6() {
		int empHrs = 0, totalEmpHrs = 0, empWage = 0, totalDays = 0;
		while (totalEmpHrs <= Max_Working_Hrs && totalDays < Number_of_Working_Days) {

			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case Is_Part_Time:
				empHrs = 4;

				break;
			case Is_Full_Time:
				empHrs = 8;

				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Days WOrked: " + totalDays + " WOrkig  hours+ " + empHrs);
			totalDays++;
		}
		int totalEmpWage = totalEmpHrs * Emp_Rate_per_hr;
		System.out.println("Total Employee Wage: " + totalEmpWage);
	}

	
	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation Program!\n\n\n");
		
		System.out.println("1.To check whether employee is absent or present");
		System.out.println("2.To calculate the employee daily wage");
		System.out.println("3.TO check for part time employee");
		System.out.println("4.Using Switch Statements");
		System.out.println("5.Using FOr loop for monthly computation");
		System.out.println("6.Using WHile loop for by providing target");
		System.out.println("7.Exit");
		
		System.out.println("Enter the option: ");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			int op  = sc.nextInt();
		switch (op) {
		case 1:
			uc1();// To check whether employee is absent or present
			break;
		case 2:
			uc2(); // To calculate the employee daily wage
			break;
		case 3:
			uc3(); // TO check for part time employee
			break;
		case 4:
			uc4();// Using Switch Statements
			break;
		case 5:
			uc5(); // Using FOr loop for monthly computation
			break;
		case 6:
			uc6(); // Using WHile loop for by providing target
			break;
		case 7:
			flag = false;
			break;
		default:
			break;
		}
		}
	}

}
