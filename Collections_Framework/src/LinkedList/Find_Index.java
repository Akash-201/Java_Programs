package LinkedList;

import java.util.LinkedList;

public class Find_Index
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

		 //find index of any element
	    System.out.println(list.indexOf("Sql"));
	   

	}

}
