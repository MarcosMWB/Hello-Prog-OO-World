public class Employer
{
	private String name;
	private double salary;
	
	public Employer (String n, double s)
	{	name = n;
		salary = s;
	}

	public void print_employer()
	{	System.out.println ("Name = " + name + "  Salary = " + salary);
	}

	public String getName()
	{	return name;
	}
		
	public double getSalary()
	{	return salary;
	}
		
	public void setName(String n)
	{	name = n;
	}
		
	public void setSalary(double s)
	{	salary = s;
	}
}
