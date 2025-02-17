package LinkedList;

import java.util.LinkedList;

public class Add_Elements
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


		//print all elements using loop
		for(String str : list)
		{
			System.out.println(str);
		}


	}

}
