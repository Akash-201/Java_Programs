package ArrayList;

import java.util.ArrayList;

//insert an element at a particular position of an ArrayList


public class Insert_An_Element_At_A_Particular_Position
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<>();

		list.add("ONE");
		list.add("TWO");
		list.add("THREE");
		list.add("FOUR");
		list.add("FIVE");

		// print all elements
		System.out.println(list);

		//Inserting "AAA" at index 1
		list.add(1,"AAA");		

		System.out.println(list);


		//Inserting "BBB" at index 3
		list.add(3,"BBB");		

		System.out.println(list);



	}


}
