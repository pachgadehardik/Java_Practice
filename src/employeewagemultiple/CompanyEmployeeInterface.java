package employeewagemultiple;
//Creating Interface for the common behavior of multiple companies
public interface CompanyEmployeeInterface{
	public void computeEmpWage();
	public void addCompanyEmpData(String companyName, int Emp_Rate_per_hr, int Number_of_Working_Days, int Max_Working_Hrs);
	public void computeEmpWage(CompanyEmployeeData companyEmployeeData);
}