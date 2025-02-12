package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Min_Max
{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		list.add(45);
		list.add(94);
		list.add(24);
		list.add(95);
		list.add(244);
		list.add(5);
		list.add(456);
		list.add(-13);
		
		
		System.out.println("All elements: "+list);
		
		// with pre define method
//		int min=Collections.min(list);
//		int max=Collections.max(list);
		
		
		
		// without special method
		int min=list.get(0);
		int max=list.get(0);
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)<min)
			{
				min=list.get(i);
			}
			if(list.get(i)>max)
			{
				max=list.get(i);
				
			}
		}
		
		
		System.out.println("Minimum valuue: "+min);
		System.out.println("maximum value: "+max);
		
	}

}
