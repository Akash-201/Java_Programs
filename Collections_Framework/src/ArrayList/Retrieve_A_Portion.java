package ArrayList;

//retrieve a portion of an ArrayList

import java.util.ArrayList;
import java.util.List;

public class Retrieve_A_Portion
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list=new ArrayList<>();
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

		
        //Retrieving a SubList
		List<Integer> sublist=list.subList(2,5);
		
		System.out.println(sublist);



	}

}
