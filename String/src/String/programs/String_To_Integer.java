package String.programs;

public class String_To_Integer 
{
	public static void main(String[] args) {
		String str = "5678";

		// Convert string to integer
//		int number = Integer.valueOf(str);
		int number = Integer.parseInt(str);

		// Output the result
		System.out.println("Converted integer: " + number);
	}


}
