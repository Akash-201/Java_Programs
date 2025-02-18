package LinkedList;
//add an element or collection of elements at a specific position of a LinkedList

import java.util.LinkedList;

public class Insert_An_Element_At_A_Particular_Position 
{
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		// print all elements
		System.out.println(list);
		
		list.add(1,15);
		System.out.println(list);
		
		LinkedList<Integer> list1=new LinkedList<>();
		list1.add(50);
		list1.add(60);
		list1.add(70);
		
		// print all elements of list1
		System.out.println(list1);
		
		
		list.addAll(3,list1);
		
		//Print all elements of list and list1
		System.out.println(list);
		
		
		
		
		
		

	}

}
