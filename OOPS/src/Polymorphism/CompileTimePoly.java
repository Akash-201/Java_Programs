package Polymorphism;

class Student
{
	public void read()
	{
		System.out.println("Student is reading...");
	}
	
	public void read(String bookName)
	{
		System.out.println("Book Name is "+bookName);
	}
}



public class CompileTimePoly 
{
	public static void main(String[] args)
	{
		System.out.println("Just for testing purpose...");

		Student s=new Student();
		s.read();
		s.read("Core Java");
	}

}
