package Encapsulation;

//Q: Create an Employee Management System using Encapsulation
//Create a class Employee with private attributes:
//empId (int)
//name (String)
//salary (double)
//Create a constructor to initialize values.
//Use getter and setter methods to update salary but ensure salary cannot be negative.
//Write a method displayEmployeeDetails() to show employee information.

public class EmployeeDetails
{
	private int empId;
	private String name;
	private double salary;
	
	public EmployeeDetails(int empId, String name, double salary)
	{
		this.empId=empId;
		this.name=name;
		if(salary>=0)
		{
			this.salary=salary;
		}else {
			this.salary=0;
		}
	}
		
	    public int getEmpId() {
	        return empId;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getSalary() {
	        return salary;
	    }
	    
	    // Setter method for salary with validation
	    public void setSalary(double salary)
	    {
	    	if(salary>=0)
	    	{
	    		this.salary=salary;
	    	}
	    	else {
	    		 System.out.println("Salary cannot be negative.");
	    	}
	    }
	    
	    // Method to display employee details
	    public void displayEmployeeDetails() {
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	    }
	    
	    public static void main(String[] args) {
	    	EmployeeDetails emp1 = new EmployeeDetails(101, "Rupesh Kumar", 50000);
	    	EmployeeDetails emp2 = new EmployeeDetails(102, "Rahul Kumar", 60000);

	        // Displaying employee details
	        emp1.displayEmployeeDetails();
	        System.out.println();
	        emp2.displayEmployeeDetails();

	        // Updating salary
	        emp1.setSalary(55000);
	        emp2.setSalary(-5000); // This should trigger the validation message

	        System.out.println();
	        // Displaying updated employee details
	        emp1.displayEmployeeDetails();
	        System.out.println();
	        emp2.displayEmployeeDetails();
	    }
	
	

}
