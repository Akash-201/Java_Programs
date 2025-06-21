package Inheritance;

//Multilevel Inheritance

class GrandFather
{
	String land="10 Acre";
	String home="2 Home";
	
	public void hobby()
	{
		System.out.println("Travelling");
	}
}

class Father extends GrandFather
{
	String land="15 Acre";
	String home="3 Home";
	int car=2;
	
	@Override
	public void hobby()
	{
		super.hobby();
		System.out.println("Travelling and Singing");
	}
	
}

public class Child extends Father
{
	int Bike=1;
	
	@Override
	public void hobby()
	{
		super.hobby();
		System.out.println("Travelling, Dancing, Reading...");
	}
	
	public static void main(String[] args)
	{
		Child c=new Child();
		c.hobby();
		System.out.println(c.land);
		
	}
	
	

}
