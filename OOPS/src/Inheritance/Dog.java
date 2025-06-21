package Inheritance;

class Animal
{
	String color="White";
	public void makeNoise()
	{
		System.out.println("Animal makes noise");
	}
}
public class Dog  extends Animal
{
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.makeNoise();
		System.out.println(d.color);

	}

}
