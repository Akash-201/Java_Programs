package LinkedList;

import java.util.LinkedList;

public class CountElementsInList 
{
	public static void main(String[] args)
	{
		LinkedList<String> list=new LinkedList<>();
		list.add("Java");
		list.add("J2EE");
		list.add("Spring");
		list.add("SpringBoot");
		list.add("Sql");


		// print all elements
		System.out.println(list);
		

		// Counting elements manually without using any method
		int count = 0;
		for (String str : list)
		{
			count++;
		}
		System.out.println("Total elements using manual count: " + count);


	}


}
