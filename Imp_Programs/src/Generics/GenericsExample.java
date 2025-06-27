package Generics;

class Printer
{
	Integer thingToPrint;
	
	public Printer(Integer thingToPrint)
	{
		this.thingToPrint=thingToPrint;
	}
	public void print()
	{
		System.out.println(thingToPrint);
	}
}

public class GenericsExample 
{
	public static void main(String[] args) 
	{
		Printer printer=new Printer(1234);
		printer.print();
		
	}

}
