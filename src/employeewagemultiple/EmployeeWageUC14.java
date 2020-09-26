package employeewagemultiple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Includes UC 13 and 14 Consolidated

public class EmployeeWageUC14 implements CompanyEmployeeInterface {

	final static int Is_Full_Time = 1;
	final static int Is_Part_Time = 2;

	private static ArrayList<CompanyEmployeeData> companyEmployeeDataList;
	private static Map<String, CompanyEmployeeData> companayNameToEmpMap;

	public EmployeeWageUC14() {
			companyEmployeeDataList = new ArrayList<CompanyEmployeeData>();
			companayNameToEmpMap = new HashMap<String, CompanyEmployeeData>();
	}

	@Override
	public void computeEmpWage() {
		for(int i = 0; i<companyEmployeeDataList.size();i++) {
			CompanyEmployeeData companyEmployeeData = companyEmployeeDataList.get(i);
			companyEmployeeData.setTotalEmpWage(this.computeEmpWage(companyEmployeeData));
//			companayNameToEmpMap.get(key)
			System.out.println(companyEmployeeData);
		}
		

	}

	@Override
	public void addCompanyEmpData(String companyName, int Emp_Rate_per_hr, int Number_of_Working_Days, int Max_Working_Hrs) {
		CompanyEmployeeData companyEmpData = new CompanyEmployeeData(companyName, Emp_Rate_per_hr, Number_of_Working_Days, Max_Working_Hrs);
		companyEmployeeDataList.add(companyEmpData);
		companayNameToEmpMap.put(companyName, companyEmpData);
	}

	@Override
	public int getTotalWage(String companyName) {
		return companayNameToEmpMap.get(companyName).totalEmpWage;
	}
	
	@Override
	public int computeEmpWage(CompanyEmployeeData companyEmployeeData) {
		int empHrs = 0, totalEmpHrs = 0, totalDays = 0;
		while (totalEmpHrs <= companyEmployeeData.Max_Working_Hrs
				&& totalDays < companyEmployeeData.Number_of_Working_Days) {

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
//		System.out.println("Total Employee Wage for the company: "+companyEmployeeData.companyName+" is: " + totalEmpWage);
		return totalEmpWage;
	}
	
	public static void main(String args[]) {

		// Creating instance Interface of type EmployeeBuilderArray
		CompanyEmployeeInterface obb = new EmployeeWageUC14();
		obb.addCompanyEmpData("Dmart", 20, 15, 8);
		obb.addCompanyEmpData("JioMart", 10, 20, 10);
		obb.addCompanyEmpData("Croma", 25, 25, 15);
		obb.computeEmpWage();
		
		System.out.println("Total Wage for JioMart is: "+obb.getTotalWage("JioMart"));
	}
	

	
}
