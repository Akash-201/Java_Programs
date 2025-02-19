package LinkedList;

import java.util.LinkedList;

//retrieve and remove and only retrieve an element from specific position of a LinkedList

public class Remove_Particular_Index
{
	
	public static void main(String[] args)
	{
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		//print all elements
		System.out.println(list);
		
		 //Retrieving and removing an element at index 1 of the list
		list.remove(1);
		System.out.println(list);
		
		
		
	}
	

}
