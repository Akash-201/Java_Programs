package CompanyQuestions;

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
