package Encapsulation;

 class Demo 
{
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}

}
public class Basic
{
	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.setName("Rahul");
		d.setAge(24);
		
		 System.out.println("Name: " + d.getName());
	        System.out.println("Age: " + d.getAge());
		
	}
	
}
