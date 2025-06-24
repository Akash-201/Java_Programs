package AbstractionAndInterface;

  interface Shape 
{
	public static final int i=10;  // here public static final is optional
	
	public abstract void calculateArea(int r);  // here public abstract is optional
	
}

public class CircleShape implements Shape
{
	public void calculateArea(int r)
	{
		System.out.println("Area of Circle is "+ (Math.PI*r*r));
	}
	
	public static void main(String[] args) 
	{
		CircleShape s1=new CircleShape();
		s1.calculateArea(2);
		
	}
}
