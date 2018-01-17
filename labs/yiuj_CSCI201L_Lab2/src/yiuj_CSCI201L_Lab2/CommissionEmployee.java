package yiuj_CSCI201L_Lab2;

public class CommissionEmployee extends SalariedEmployee {
	private double salesTotal;
	private double commissionPercentage;
	
	public CommissionEmployee(String fName, String lName, String bd, int id, 
			String title, String comp, double annualSalary, double total, double percent) {
		super(fName, lName, bd, id, title, comp, annualSalary);
		this.salesTotal = total;
		this.commissionPercentage = percent;
	}

	public double getSalesTotal() {
		return salesTotal;
	}

	public double getCommissionPercentage() {
		return commissionPercentage;
	}
	
	public double getAnnualSalary() {
		return this.annualSalary + salesTotal * commissionPercentage;
	}
}
