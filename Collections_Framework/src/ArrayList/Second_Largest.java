package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Second_Largest
{
	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(45);
		list.add(94);
		list.add(24);
		list.add(95);
		list.add(244);
		list.add(5);
		list.add(456);
		list.add(-13);
		
		System.out.println("List of elements: "+list);
		
		Collections.sort(list);
		int secondLargestNumber=list.get(list.size()-2);
		System.out.println("Second Largest Element: "+secondLargestNumber);
		
		
		
	}	

}
