public class EmployeeTest
{
	public static void main(String[] args)
	{
		CommissionEmployee emp1 = 
			new CommissionEmployee("John Doe", 5000, 0.05);
		System.out.println(emp1);
		System.out.println("pay: " + emp1.getPay());
		
		BaseCommissionEmployee emp2 = 
			new BaseCommissionEmployee("Pearl Evans", 4500,
			0.045, 500);
		System.out.println(emp2);
		System.out.println("pay: " + emp2.getPay());
	}
}