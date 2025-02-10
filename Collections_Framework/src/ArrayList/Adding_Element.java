package ArrayList;

import java.util.ArrayList;

public class Adding_Element 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		// print all elements
		System.out.println(list);
		
		
		
		  // Print elements using a loop
		for(int num : list)
		{
			System.out.println(num);
		}
		
	}

}
