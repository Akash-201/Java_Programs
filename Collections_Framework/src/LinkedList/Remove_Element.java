package LinkedList;
//remove the elements of a LinkedList from both the ends

//we can use pollLast() and removeLast() to remove the elements from the tail of a LinkedList 
//and to remove the elements from the head of a LinkedList, use poll() or pollFirst() or remove() or removeFirst().

import java.util.LinkedList;

public class Remove_Element 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list=new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		
		//print all elements
		System.out.println(list);
		
		
		// remove from frist
		list.remove();
		list.removeFirst();
		list.poll();
		list.pollFirst();
		
		System.out.println(list);
		
		
		
		// remove from last
		list.removeLast();
		list.pollLast();
		
		System.out.println(list);
		
	}

}
