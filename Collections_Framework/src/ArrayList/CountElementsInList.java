package ArrayList;

import java.util.ArrayList;

public class CountElementsInList 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		 // Counting elements using size() method
        System.out.println("Total elements using size() method: " + list.size());
        
        // Counting elements manually without using any method
        int count = 0;
        for (int num : list) {
            count++;
        }
        System.out.println("Total elements using manual count: " + count);
		


	}

}
