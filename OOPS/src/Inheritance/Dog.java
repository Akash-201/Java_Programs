package Inheritance;

// single inheritance

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
	@Override
	public void makeNoise()
	{
		super.makeNoise();
		System.out.println("Dog is barking");
	}
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.makeNoise();
		System.out.println(d.color);
	}
}
