package Abstraction;

abstract  class Parent
{
	public void calculate()
	{
		System.out.println("Concrete Method");
	}

	abstract public void launch();
}

class Child extends Parent 
{
	public void launch()
	{
		System.out.println("Abstract Method");
	}
}


public class Main
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.calculate();
		c.launch();

	}
}
