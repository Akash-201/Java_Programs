package Constructor;

public class MainClass2
{
	public static void main(String[] args)
	{
		Student_ConstructorOverloading sco1=new Student_ConstructorOverloading(101);
		System.out.println("Student id is "+sco1.studentId);
		
		Student_ConstructorOverloading sco2=new Student_ConstructorOverloading(102,"Rahul","Patna");
		System.out.println("Student id is "+sco2.studentId);
		System.out.println("Student name is "+sco2.studentName);
		System.out.println("Student city name is "+sco2.studentCity);


	}
	

}
