//Compute Employee Wage for multiple company


public class EmployeeWageUC8 {
		
//	Constant Variables
	final static int Is_Full_Time = 1;
	final static int Is_Part_Time = 2;
//	
	public static void computeWage(String companyName, int Emp_Rate_per_hr, int Number_of_Working_Days, int Max_Working_Hrs) {
		int empHrs = 0, totalEmpHrs = 0, totalDays = 0;
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
			System.out.println("Day Number: " + totalDays + " Working  hours: " + empHrs);
			totalDays++;
		}
		int totalEmpWage = totalEmpHrs * Emp_Rate_per_hr;
		System.out.println("Total Employee Wage for the company: "+companyName+" is: " + totalEmpWage);
	}
	
	public static void main(String args[]) {
		//Passing the hardcoded arguments in the method
		computeWage("DMart", 15, 5, 10);
		computeWage("BigBazaar", 20, 9, 20);
}
	
}
