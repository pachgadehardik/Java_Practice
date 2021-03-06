package employeewagemultiple;

//Creating a class for Setting of the Employee Data Variables


public class CompanyEmployeeData {

	public String companyName;
	public int Emp_Rate_per_hr;
	public int Number_of_Working_Days;
	public int Max_Working_Hrs;
	public int totalEmpWage;
	
	public CompanyEmployeeData(String companyName, int Emp_Rate_per_hr, int Number_of_Working_Days, int Max_Working_Hrs) {
		//Constructor
		this.companyName = companyName;
		this.Emp_Rate_per_hr = Emp_Rate_per_hr;
		this.Number_of_Working_Days = Number_of_Working_Days;
		this.Max_Working_Hrs  = Max_Working_Hrs;
		totalEmpWage = 0;
	}

	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	@Override
	public String toString() {
		return "Total Employee Wage for the company: "+this.companyName+" is: " + this.totalEmpWage;
	}
}
