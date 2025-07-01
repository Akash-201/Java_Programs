package _4CECloudLabs;

class Student{
	public void read()
	{
		System.out.println("Student is reading.....");
	}
	
	public void read(String bookName)
	{
		System.out.println("Book Name is: "+bookName);
	}
}

public class Polymorphism 
{
	public static void main(String[] args) {
		System.out.println("Just for testing purpose..");
		Student student=new Student();
		student.read();
		student.read("Core Java");
	}
	

}
