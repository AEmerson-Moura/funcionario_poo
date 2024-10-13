package entities;

public class Employee {
	private String Name;
	private double GrossSalary;
	private double Tax;
	
	public Employee(String name, double grossSalary, double tax) {
		Name = name;
		GrossSalary = grossSalary;
		Tax = tax;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getGrossSalary() {
		return GrossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		GrossSalary = grossSalary;
	}

	public double getTax() {
		return Tax;
	}

	public void setTax(double tax) {
		Tax = tax;
	}
	
	
	public double NetSalary() {
		return GrossSalary - Tax;
	}
	public void IncreaseSalary(double percentage) {
		GrossSalary += GrossSalary * percentage / 100.0;
	}

	@Override
	public String toString() {
		return Name + ", " + String.format("%.2f", NetSalary()) ;
	}
	
	
	
}
