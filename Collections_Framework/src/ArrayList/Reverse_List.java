package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_List 
{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(56);
		list.add(24);
		list.add(68);
		list.add(24);
		list.add(46);
		
		// print all elements
		System.out.println("Before reverse: "+list);
		
		Collections.reverse(list);
		System.out.println("After reverse: "+list);
		
		
		
	}

}
