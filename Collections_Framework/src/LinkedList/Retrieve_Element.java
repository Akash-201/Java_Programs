package LinkedList;
//retrieve but not remove the elements of a LinkedList from both the ends

import java.util.LinkedList;

public class Retrieve_Element 
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list=new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// print all elements
		System.out.println(list);

		//Retrieving the elements from the head
		System.out.println(list.getFirst());


		//Retrieving the elements from the tail
		System.out.println(list.getLast());
	}

}
