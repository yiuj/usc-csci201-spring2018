package yiuj_CSCI201L_Lab2;

public class SalariedEmployee extends Employee{
	double annualSalary;
	
	public SalariedEmployee(String fName, String lName, String bd, int id, 
			String title, String comp, double annualSalary){
		super(fName, lName, bd, id, title, comp);
		this.annualSalary = annualSalary;
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}
}
