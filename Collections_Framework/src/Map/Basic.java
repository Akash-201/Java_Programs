package Map;

import java.util.HashMap;

public class Basic 
{
	public static void main(String[] args) {
		HashMap<String, Integer> course = new HashMap<>();
		
		course.put("Core Java",5000);
		course.put("Advance Java",2000);
		course.put("Framework",3000);
		course.put("SQL",1500);
		course.put("Web",3000);
		
		System.out.println(course);
		
	}

}
