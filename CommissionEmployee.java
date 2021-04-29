public class CommissionEmployee
{
	private String name;
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String name,
		double grossSales, double commissionRate)
	{
		if(grossSales < 0)
			throw new IllegalArgumentException(
				"gross sales must be >= 0");
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
				"commission rate must be > 0.0 and <= 1.0");
				
			this.name = name;
			this.grossSales = grossSales;
			this.commissionRate = commissionRate;
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
	
	public double getPay()
	{
		return commissionRate * grossSales;
	}
	
	public String toString()
	{
		return String.format("Commission employee: %s%ngross sales: %.2f%ncommission rate: %.2f",
			name, grossSales, commissionRate);
	}
}