package LinkedList;
// You can use add() or addLast() or offer() or offerLast() to add the elements at the tail of a LinkedList
// and to add the elements at the head of a LinkedList, use either addFirst() or offerFirst().

import java.util.LinkedList;

public class Head_Tail 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list=new LinkedList<>();

		//Adding elements at the end of the list

		list.add(10);
		list.add(20);
		list.addLast(30);
		list.offerLast(40);
		list.offer(50);

		// printing all elements
		System.out.println(list);

		//Adding elements at the beginning of the list
		list.addFirst(5);
		list.offerFirst(6);

		//Printing the elements of list
		System.out.println(list);


	}

}
