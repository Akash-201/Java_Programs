package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

//join an ArrayList at the end of a LinkedList

public class JoinArraylistInLinkedList
{
	public static void main(String[] args)
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.add("Java");
		ll.add("J2EE");
		ll.add("Spring");
		ll.add("Springboot");
		
		// print all linkedlist elements
		System.out.println("LinkedList elements: "+ll);
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Html");
		al.add("Css");
		al.add("JavaScript");
		al.add("ReactJs");
		
		
		// print all Arraylist elements
		System.out.println("ArrayList elements: "+al);
		
		
		//Appending arrayList at the end of linkedList
		ll.addAll(al);
		//Printing the elements of linkedList
		System.out.println("Adding Arraylist at the end of a LinkedList: "+ll);
		
		
	
		
		
	}
	

}
