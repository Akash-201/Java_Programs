package LeetCode_Questions;

// Leetcode:- 744. Find Smallest Letter Greater Than Target

public class FindSmallestLetterGreaterThanTarget744 
{
	public static char nextGreatestLetter(char[] letters, char target)
	{
		char greater=letters[0];
		for(int i=0;i<letters.length;i++)
		{
			if(letters[i]>target)
			{
				greater=letters[i];
				break;

			}
		}
		return greater;
	}
	public static void main(String[] args) 
	{
		char[] letters= {'c','f','j'};
		System.out.println(nextGreatestLetter(letters,'a')); // c

		char[] letters2= {'c','f','j'};
		System.out.println(nextGreatestLetter(letters2,'c')); // f

		char[] letters3= {'x','x','y','y'};
		System.out.println(nextGreatestLetter(letters3,'z')); // x

	}
}
