//Compute Employee Wage and total wage by company Usecase 9

public class EmployeeWageBuilder {
	//Constants
	final static int Is_Full_Time = 1;
	final static int Is_Part_Time = 2;
	
	//Class Variables (state)
	private String companyName;
	private int Emp_Rate_per_hr;
	private int Number_of_Working_Days;
	private int Max_Working_Hrs;
	private static int totalEmpWage;
	
	//Initializing the Constructor
	public EmployeeWageBuilder(String companyName, int Emp_Rate_per_hr, int Number_of_Working_Days, int Max_Working_Hrs) {
		// TODO Auto-generated constructor stub
		this.companyName = companyName;
		this.Emp_Rate_per_hr = Emp_Rate_per_hr;
		this.Number_of_Working_Days = Number_of_Working_Days;
		this.Max_Working_Hrs  = Max_Working_Hrs;
	}
	
	//Computing the wage using method (behavior)
	public void computeWage() {
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
		totalEmpWage = totalEmpHrs * Emp_Rate_per_hr;
		System.out.println("Total Employee Wage for the company: "+companyName+" is: " + totalEmpWage);
	}
	 
	//To print the object 
	@Override
	public String toString() {
		return "Total Employee Wage for the Company: "+companyName+" is: "+totalEmpWage;
	}
	
	public static void main(String args[]) {
		//Creating instance of the class 
		EmployeeWageBuilder obj1 = new EmployeeWageBuilder("DMart", 20, 3, 10);
		EmployeeWageBuilder obj2 = new EmployeeWageBuilder("BigBazzar", 10, 5, 2);
		
		//Calling the instance methods
		obj1.computeWage();
		System.out.println(obj1);
		
		obj2.computeWage();
		System.out.println(obj2);
	}

}
