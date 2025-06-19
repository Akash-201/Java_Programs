package Constructor;

public class Student 
{
	int studentId;
	String studentName;
	String studentCity;
	
	public Student()
	{
		System.out.println("Non-Parameterized Constructer");
	}
	public Student(int studentId,String studentName,String studentCity)
	{
		
		System.out.println("Parameterized Constructor");
		this.studentCity=studentCity;
		this.studentId=studentId;
		this.studentName=studentName;
	}

}
