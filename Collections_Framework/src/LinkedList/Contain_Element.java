package LinkedList;

import java.util.LinkedList;

public class Contain_Element
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

		 //Checking whether list conatins or not
	    System.out.println(list.contains("Java"));
	   

	}
}
