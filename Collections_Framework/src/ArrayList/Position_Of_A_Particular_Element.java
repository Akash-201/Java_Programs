package ArrayList;

import java.util.ArrayList;

public class Position_Of_A_Particular_Element 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Spring");
		list.add("SpringBoot");
		list.add("Hibernate");
		list.add("Java");
		list.add("SQL");
		list.add("Java");
		list.add("HTML");
		list.add("CSS");
		list.add("JavaScript");
		list.add("Java");
		
		
		// print all elements
		System.out.println(list);
		
		//Getting the index of first occurrence of "JAVA"
		System.out.println(list.indexOf("Java"));
		
		
		 //Getting the index of last occurrence of "JAVA"
        System.out.println(list.lastIndexOf("Java"));
		
		
	}

}
