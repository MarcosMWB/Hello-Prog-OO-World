import java.util.ArrayList;
import corejava.Console;

public class Main
{	public static void main (String[] args)
	{	final int SIZE = Console.readInt("Employers list size: ");

		ArrayList<Employer> listEmployers = new ArrayList<Employer>(SIZE);
		String name;
		double salary;
		Employer umEmpregado;

		boolean continue = true;
		while (continue)
		{	System.out.println('\n' + "What do you want to do?");
			System.out.println('\n' + "1. Register an employer");
			System.out.println("2. Alter an employer");
			System.out.println("3. Remove an employer");
			System.out.println("4. List employers");
			System.out.println("5. Exit");
						
			int option = Console.readInt('\n' + "type a number between 1 and 5:");			
					
			switch (option)
			{	case 1:
					name = Console.readLine("Employer's name: ");
					salary = Console.readDouble("Employer's salary: ");
					anEmployer = new Employer(name, salary);

					listEmployers.add(anEmployer);
					System.out.println("Employer successefully registered.");
					break;
				case 2:
										
					break;
				case 3:

					break;
				case 4:
					for(int i=0; i<listEmployers.size(); i++)
					{
						anEmployer = listaEmployers.get(i);
						anEmployer.print_employer();
					}

					break;
				case 5:
					continue = false;
					break;
				default:
					System.out.println('\n' + "Invalid option!");			
					break;
			}
		}		
	}
}
