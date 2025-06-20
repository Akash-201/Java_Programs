package Constructor;

public class Student_ConstructorOverloading 
{
	int studentId;
	String studentName;
	String studentCity;
	
	public Student_ConstructorOverloading(int id)
	{
		this.studentId=id;
	}
	public Student_ConstructorOverloading(int id, String name, String city)
	{
		this.studentCity=city;
		this.studentId=id;
		this.studentName=name;
	}
	

}
