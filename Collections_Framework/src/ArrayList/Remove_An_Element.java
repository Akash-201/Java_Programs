package ArrayList;

import java.util.ArrayList;

//remove an element from a particular position of an ArrayList

public class Remove_An_Element
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(345);
		list.add(34);
		list.add(47);
		list.add(7856);
		list.add(256);
		
		// print all elements
		System.out.println(list);
		
	    //Removing an element from position 1
		list.remove(1);
		
		System.out.println(list);
		
	    //Removing an element from position 4
		list.remove(4);
		System.out.println(list);
		
	}
	

}
