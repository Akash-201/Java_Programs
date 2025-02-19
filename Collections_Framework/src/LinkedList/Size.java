package LinkedList;

import java.util.LinkedList;

public class Size
{
	public static void main(String[] args)
	{
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		//print all elements
		System.out.println(list);
		
		System.out.println(list.size());
	}

}
