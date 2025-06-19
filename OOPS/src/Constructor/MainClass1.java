package Constructor;

public class MainClass1 
{
	public static void main(String[] args)
	{
		Student1 s1=new Student1();
		Student1 s2=new Student1(101,"Rupesh","Patna");
		System.out.println(s2.studentId);
		System.out.println(s2.studentName);
		System.out.println(s2.studentCity);
		
	}

}
