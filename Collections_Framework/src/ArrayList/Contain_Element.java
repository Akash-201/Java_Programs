package ArrayList;

import java.util.ArrayList;

public class Contain_Element
{
	 public static void main(String[] args)
	    {
	        ArrayList<Double> list = new ArrayList<>();
	 
	        list.add(1.1);
	 
	        list.add(11.11);
	 
	        list.add(111.111);
	 
	        list.add(1111.1111);
	 
	        //Checking whether list contains '111.1111'
	 
	        System.out.println(list.contains(111.1111));    //Output : false
	    }

}
