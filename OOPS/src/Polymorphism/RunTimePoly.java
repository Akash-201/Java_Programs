package Polymorphism;

class person
{
	public void showDetails()
	{
		System.out.println("This is person class");
	}
}

class Employee extends person
{
	@Override
	public void showDetails() 
	{
		System.out.println("This is Employee Class");
	}
}

public class RunTimePoly 
{
	public static void main(String[] args)
	{
		System.out.println("Just for testing purpose...");

		person p = new Employee();
		p.showDetails();
	}

}
