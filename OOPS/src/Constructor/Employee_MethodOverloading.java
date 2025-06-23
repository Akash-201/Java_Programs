package Constructor;

public class Employee_MethodOverloading 
{
	int employeeId;
	String employeeName;
	String employeeCity;
	public void show()
	{
		System.out.println("Employee name is "+employeeName);
	}
	
	public void show(int employeeId,String employeeName, String employeeCity)
	{
		System.out.println("Employee name is "+employeeName);
		System.out.println("Employee id is "+employeeId);
		System.out.println("Employee city name is "+employeeCity);
		
	}
}

// main class name is MainClass3
