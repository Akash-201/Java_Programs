package CompanyQuestions;

public class ValidString 
{
	public static int checkValidString(String str)
	{
		int countStar=0;
		int countHash=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='*')
			{
				countStar++;
			}
			else
			{
				countHash++;
			}
		}
		if(countHash==countStar)
		{
			return 0;
		}
		else if(countStar>countHash)
		{
			return 1;
		}
		else{
			return -1;
		}
	}
public static void main(String[] args)
{
	System.out.println(checkValidString("*#**#*#"));  // 1
	System.out.println(checkValidString("*#*#*#*#")); // 0
	System.out.println(checkValidString("*##*#*#*#")); // -1
	
	
}

}
