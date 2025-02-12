package ArrayList;

import java.util.ArrayList;

public class Join_Two_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		System.out.println(list1);
		
		
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(50);
		list2.add(60);
		list2.add(70);
		list2.add(80);
		System.out.println(list2);
		
		
		// joining list1 and list2
		list1.addAll(list2);
		System.out.println(list1);
		
	}

}
