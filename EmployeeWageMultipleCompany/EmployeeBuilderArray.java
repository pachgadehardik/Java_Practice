import java.util.ArrayList;

public class EmployeeBuilderArray {
	
	final static int Is_Full_Time = 1;
	final static int Is_Part_Time = 2;
	private ArrayList<CompanyEmployeeData> CompanyEmployeeDataList;
	
	public EmployeeBuilderArray() {
		// TODO Auto-generated constructor stub
		CompanyEmployeeDataList = new ArrayList<>();
		}
	
	public void addCompanyEmployeeData(String companyName, int Emp_Rate_per_hr, int Number_of_Working_Days, int Max_Working_Hrs) {
		CompanyEmployeeDataList.add(new CompanyEmployeeData(companyName, Emp_Rate_per_hr, Number_of_Working_Days, Max_Working_Hrs));
	}
	
	public void computeEmpWage() {
		for(CompanyEmployeeData ced : CompanyEmployeeDataList) {
//			System.out.println(computeEmpWage(ced));
			computeEmpWage(ced);
		}
	}
	
	public void computeEmpWage(CompanyEmployeeData companyEmployeeData) {
		int empHrs = 0, totalEmpHrs = 0, totalDays = 0;
		while (totalEmpHrs <= companyEmployeeData.Max_Working_Hrs && totalDays < companyEmployeeData.Number_of_Working_Days) {

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
		int totalEmpWage = totalEmpHrs * companyEmployeeData.Emp_Rate_per_hr;
		System.out.println("Total Employee Wage for the company: "+companyEmployeeData.companyName+" is: " + totalEmpWage);
		
	}
	
	
	public static void main(String args[]) {
		EmployeeBuilderArray obj = new EmployeeBuilderArray();
		obj.addCompanyEmployeeData("Dmart", 20, 15, 8);
		obj.addCompanyEmployeeData("JioMart",10,20,10);
		obj.addCompanyEmployeeData("Croma", 25, 25, 15);
		obj.computeEmpWage();
	}
}
