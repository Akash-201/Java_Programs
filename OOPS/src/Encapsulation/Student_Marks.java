package Encapsulation;

//Q: Implement Student Class with Encapsulation
//Create a class Student with private variables:
//name (String)
//rollNumber (int)
//marks (double)
//Provide getter and setter methods to access and update these fields.
//Ensure that marks cannot be set to negative values using validation in setter methods.

 class Student
{
	
	private String name;
	private int rollNumber;
	private double marks;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public int getRollNumber()
	{
		return rollNumber;
	}
	
	public void setRollNumber(int rollNumber)
	{
		this.rollNumber=rollNumber;
	}
	public double getMarks()
	{
		return marks;
	}
	
	public void setMarks(double marks)
	{
		if(marks >=0)
		{
			this.marks=marks;
		}
		else
		{
			System.out.println("Marks cannot be negative.");
		}
	}
	
}

public class Student_Marks
{
	public static void main(String[] args) 
	{
		Student student=new Student();
		 // Setting values
        student.setName("John Doe");
        student.setRollNumber(123);
        student.setMarks(95.5);

        // Getting values
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Marks: " + student.getMarks());

        // Trying to set negative marks
        student.setMarks(-10);
		
	}
}


