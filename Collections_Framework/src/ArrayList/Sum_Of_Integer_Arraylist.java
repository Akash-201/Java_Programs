package ArrayList;

import java.util.ArrayList;

//Sum of all elements in an ArrayList of integers

public class Sum_Of_Integer_Arraylist 
{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		// print all elements
		System.out.println(list);
		
		int sum=0;
		for(int num : list)
		{
			sum+=num;
		}
		System.out.println("Sum: "+sum);
		
	}

}
