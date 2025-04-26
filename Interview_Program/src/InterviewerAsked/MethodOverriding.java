package InterviewerAsked;

class Animal
{
	void makeSound()
	{
		System.out.println("Animal make Sound");
	}
}
class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("Dog barks");
	}
	
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Cat make sound");
	}
}

public class MethodOverriding
{
	public static void main(String[] args)
	{
		Animal a=new Animal();
		a.makeSound();
		a=new Dog();
		a.makeSound();
		a=new Cat();
		a.makeSound();
	}

}
