package ArrayList;

import java.util.ArrayList;

//remove the given element from an ArrayList


public class Remove_Given_Element 
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


		//Removing first occurrence of "A"
		list.remove("A");
		System.out.println(list);


		//Removing first occurrence of "C"
		list.remove("C");
		System.out.println(list);




	}



}
