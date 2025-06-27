package Generics;
class printer
{
	Integer thingToPrint;
	
	public printer(Integer thingToPrint)
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
		printer printer=new printer(12934);
		printer.print();
		
	}

}
