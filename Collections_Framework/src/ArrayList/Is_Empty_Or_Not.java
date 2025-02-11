package ArrayList;

import java.util.ArrayList;

public class Is_Empty_Or_Not 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<>();
		
		System.out.println(list.isEmpty());  // true
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list.isEmpty());  // false
		
	}

}
