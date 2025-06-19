package Constructor;

public class MainClass 
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		Student s2=new Student(101,"Rupesh","Patna");
		System.out.println(s2.studentId);
		System.out.println(s2.studentName);
		System.out.println(s2.studentCity);
		
	}

}
