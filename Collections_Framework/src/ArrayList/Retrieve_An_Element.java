package ArrayList;

import java.util.ArrayList;

//retrieve an element from a particular position of an ArrayList


public class Retrieve_An_Element 
{
	
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		
		// print all elements
		System.out.println(list);
		
		

        //Getting element at index 2
		System.out.println(list.get(2));
		

        //Getting element at index 1
		System.out.println(list.get(1));
		
	}
	

}
