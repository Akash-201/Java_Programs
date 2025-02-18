package LinkedList;

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
		
		list.set(1,15);
		System.out.println(list);
	}

}
