package Inheritance;

interface A
{
	default void display()
	{
		System.out.println("Display from A");
	}
}

interface B
{
	default void display()
	{
		System.out.println("Display from B");
	}
}

class C implements A,B
{
	public void display()
	{
		A.super.display();
		System.out.println("Resolved in class C");
	}
}

public class MultipleInheritance
{
	public static void main(String[] args)
	{
		C c=new C();
		c.display();
		
	}
	

}
