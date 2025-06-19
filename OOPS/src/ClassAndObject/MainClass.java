package ClassAndObject;

public class MainClass 
{
	public static void main(String[] args)  
	{
		Student s1=new Student();
		s1.name="Ajay";
		s1.city="Motihari";
		s1.id=101;

		s1.showName();
		s1.fullDetails();
		System.out.println();

		Student s2=new Student();
		s2.name="Rahul";
		s2.id=102; 
		s2.city="Patna";
		
		s2.showName();
		s2.fullDetails();

	}

}
