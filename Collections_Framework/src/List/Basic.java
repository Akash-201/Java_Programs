package List;

import java.util.ArrayList;

public class Basic 
{
	public static void main(String[] args)
	{
		System.out.println("Start Coding...");

		/*     
		  Creating Collection

         1)  Type Safe - same type of element (objects) are added to collection

         2) Un Type safe - different types of elements are added to collection 


		 */
		
		
		// Type safe collection
		
		ArrayList<String> names=new ArrayList<>();
		
		names.add("Abhi");
		names.add("Prashant");
		names.add("Rahul");
		names.add("Rupesh");
		
		System.out.println(names);
	}

}
