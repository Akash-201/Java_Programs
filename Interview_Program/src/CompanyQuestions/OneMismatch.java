package CompanyQuestions;

/*Given a string s and an array of strings arr, 
return the first string from arr that has the same length as s and differs by exactly one character.
If no such string exists, return an empty string "".
*/

public class OneMismatch
{
	public static String isStringExist(String[] arr, String s)
	{
		int l=s.length();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()!=l)
				continue;
			
			int count=0;
			for(int j=0;j<l;j++)
			{
				if(arr[i].charAt(j)!=s.charAt(j))
				count++;
			}
			if(count==1)
			{
				return arr[i];
			}
		}
		return "";
		
		
	}
	
	public static void main(String[] args)
	{
		String[] arr= {"bana","apple","banaba","bonanzo"};
		String s="banana";
		System.out.println(isStringExist(arr, s));
	}

}
