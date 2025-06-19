package Constructor;

public class Student1
{
	int studentId;
	String studentName;
	String studentCity;
	
	public Student1()
	{
		System.out.println("Non-Parameterized Constructer");
	}
	public Student1(int studentId,String studentName,String studentCity)
	{
		
		System.out.println("Parameterized Constructor");
		this.studentCity=studentCity;
		this.studentId=studentId;
		this.studentName=studentName;
	}

}
