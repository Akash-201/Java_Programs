package ArrayList;
//Sort an ArrayList of integers in descending order

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortArraylist
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(23);
		list.add(66);
		list.add(213);
		list.add(13);
		list.add(7);
		list.add(456);

		// print all elements
		System.out.println("Before sorting: "+list);

		
		Collections.sort(list, Collections.reverseOrder());

		System.out.println("After sorting:"+list);

	}

}
