package yiuj_CSCI201L_Lab2;

public class HourlyEmployee extends Employee {
	int hourlyRate;
	int numberHoursPerWeek;
	
	public HourlyEmployee(String fname, String lname, String birth, int id, 
			String title, String companyName, int hrate, int hoursPWeek) {
		super(fname, lname, birth, id, title, companyName);
		hourlyRate = hrate;
		numberHoursPerWeek = hoursPWeek;
	}
	
	public double getAnnualSalary() {
		return hourlyRate * numberHoursPerWeek * 52;
	}
}
