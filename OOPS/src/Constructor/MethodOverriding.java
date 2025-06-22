package Constructor;

class A
{
	public void m1()
	{
		System.out.println("I am m1() of class A");
	}
}

class B extends A
{
	public void m1()
	{
		System.out.println("I am m1() of class B");
	}

}
public class MethodOverriding 
{
	public static void main(String[] args)
	{
		B b=new B();
		b.m1();

	}

}
