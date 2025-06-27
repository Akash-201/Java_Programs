package Generics;

class AllPrinter<T>
{
	T thingToPrint;

	public AllPrinter(T thingToPrint)
	{
		this.thingToPrint=thingToPrint;
	}

	public void print()
	{
		System.out.println(thingToPrint);
	}

}

public class ClassType 
{
	public static void main(String[] args) {
		AllPrinter<Integer> allPrinter=new AllPrinter(98765);
		allPrinter.print();

		AllPrinter<Double> allPrinter2=new AllPrinter(34.56);
		allPrinter2.print();

		AllPrinter<Boolean> allPrinter3=new AllPrinter(true);
		allPrinter3.print();

	}

}
