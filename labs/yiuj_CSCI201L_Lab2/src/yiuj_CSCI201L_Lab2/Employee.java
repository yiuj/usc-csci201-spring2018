package yiuj_CSCI201L_Lab2;

public abstract class Employee extends Person{
	int employeeID;
	String jobTitle;
	String company;
	
	public Employee(String fname, String lname, String birth, int id, 
			String title, String company) {
		this.firstName = fname;
		this.lastName = lname;
		this.birthdate = birth;
		this.employeeID = id;
		this.jobTitle = title;
		this.company = company;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	
	public String getCompany() {
		return company;
	}
	
	public abstract double getAnnualSalary();
}
