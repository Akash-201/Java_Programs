package LinkedList;
//replace an element at a specific position of a LinkedList with the given element

//To replace an element at specific position of a LinkedList , use set() method.

import java.util.LinkedList;

public class Replace_A_Particular_Element
{
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// print all elements
		System.out.println(list);
		
		//Replacing an element at a particular index
		list.set(1,15);
		list.set(3,45);
		System.out.println(list);
	}

}
