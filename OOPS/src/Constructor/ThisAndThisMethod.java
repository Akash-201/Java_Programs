package Constructor;

public class ThisAndThisMethod
{
	int studentId;
	String studentName;
	String studentCity;

	public ThisAndThisMethod()
	{
		this(101,"Prashant","Nalanda");
		System.out.println("Non parameterized Constructor called");
	}
	public ThisAndThisMethod(int id, String name, String city)
	{
		this.studentId=id;
		this.studentName=name;
		this.studentCity=city;
		System.out.println("Parameterized constructor called");
	}
	
	public void display()
	{
		System.out.println("ID: "+this.studentId);
		System.out.println("Name: "+this.studentName);
		System.out.println("City: "+this.studentCity);
	}
	
	public static void main(String[] args) 
	{
		ThisAndThisMethod s1=new ThisAndThisMethod();
		s1.display();
		System.out.println("-------------------------------");
		ThisAndThisMethod s2=new ThisAndThisMethod(102,"Rahul","Patna");
		s2.display();
		
	}

}
