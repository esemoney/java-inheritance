public class BaseCommissionEmployee
{
	private String name;
	private double grossSales;
	private double commissionRate;
	private double baseSalary;
	
	public BaseCommissionEmployee(String name,
		double grossSales, double commissionRate,
		double baseSalary)
	{
		if(grossSales < 0)
			throw new IllegalArgumentException(
				"gross sales must be >= 0");
				
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
				"commission rate must be > 0.0 and <= 1.0");
				
		if(baseSalary <= 0)
			throw new IllegalArgumentException(
				"base salary must be > 0");
		
		this.name = name;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
		this.baseSalary = baseSalary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getCommissionRate()
	{
		return commissionRate;
	}
	
	public double getGrossSales()
	{
		return grossSales;
	}
	
	public double getBaseSalary()
	{
		return baseSalary;
	}
	
	public double getPay()
	{
		return baseSalary + (commissionRate * grossSales);
	}
	
	public String toString()
	{
		return String.format("Base commission employee: %s%ngross sales: %.2f%ncommission rate: %.2f%nbase salary: %.2f",
			name, grossSales, commissionRate, baseSalary);
	}
}