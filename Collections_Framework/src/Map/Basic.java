package Map;

import java.util.HashMap;

public class Basic 
{
	public static void main(String[] args) {
		HashMap<String, Integer> courses = new HashMap<>();
		
		courses.put("Core Java",5000);
		courses.put("Advance Java",2000);
		courses.put("Framework",3000);
		courses.put("SQL",1500);
		courses.put("Web",3000);
		
		System.out.println(courses);
		
		System.out.println(courses.get("Core Java"));
		
	}

}
