package CompanyQuestions;

public class Demo
{
	public static String findString(String[] arr, String s)
	{
		int l=s.length();
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()!=l)
				continue;
			
			int count=0;
			if(arr[i].toCharArray()!=s.toCharArray())
			{
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
		System.out.println(findString(arr, s));
	}

}
