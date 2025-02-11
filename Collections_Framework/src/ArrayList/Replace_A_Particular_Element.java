package ArrayList;

import java.util.ArrayList;

//replace a particular element in an ArrayList with the given element


public class Replace_A_Particular_Element
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(14);
		list.add(45);
		list.add(86);
		list.add(29);
		list.add(95);
		
		// print all elements
		System.out.println(list);
		
		//Replacing the element at index 2 with 33
		list.set(2,33);
		
		
		//Replacing the element at index 5 with 75
		list.set(5, 75);
		
		System.out.println(list);
		
		
	}
	

}
