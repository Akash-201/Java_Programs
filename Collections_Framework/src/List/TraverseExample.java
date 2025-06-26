package List;

import java.util.ArrayList;

public class TraverseExample
{
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();

		names.add("Abhi");
		names.add("Durgesh");
		names.add("Rahul");
		names.add("Rupesh");

		for(String str : names)
		{
			System.out.println(str+"\t"+str.length());
		}
	}

}
