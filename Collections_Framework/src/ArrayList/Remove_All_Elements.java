package ArrayList;
//remove all elements of an ArrayList at a time

import java.util.ArrayList;

public class Remove_All_Elements
{
	public static void main(String[] args)
	{

		ArrayList<String> list=new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("A");
		list.add("B");
		list.add("C");

		//print all elements
		System.out.println(list);

		//Removing all elements of the list
		list.clear();
		System.out.println(list);
	}

}
