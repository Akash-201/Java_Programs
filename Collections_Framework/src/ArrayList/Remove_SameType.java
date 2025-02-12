package ArrayList;

import java.util.ArrayList;

//Remove all occurrences of a specific string


public class Remove_SameType 
{
	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<>();

		list.add("Apple");
		list.add("Banana");
		list.add("Apple");
		list.add("Cherry");
		list.add("Mango");

		// print all elements
		System.out.println("Before: "+list);

		// Remove all occurrences of "Apple"
		list.removeIf(str -> str.equals("Apple"));

		// Print after removal
		System.out.println("After: "+list);





	}

}
