package String.programs;

// input: a2b3c4
// output: aabbbcccc


public class Pattern
{
	public static void printPattern(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))  // here check i is number or alphabet
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				 int x=Character.getNumericValue(str.charAt(i));  // here check i is number or alphabet
				 
				 for(int j=1;j<x;j++)   // Print (x-1) more times
				 {
					 System.out.print(str.charAt(i-1));  //  Print previous character (alphabet)
				 }
			}
		}
	}
	public static void main(String[] args) {
		String str="a2b3c4";
		printPattern(str);
	}
	

}
