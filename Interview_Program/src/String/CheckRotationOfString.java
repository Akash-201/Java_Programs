package String;

//Check Rotation of String
//Input: 'waterbottle', 'erbottlewat' => Output: true

public class CheckRotationOfString 
{
	public static String rotateString(String str1)
	{
		char[] ch=str1.toCharArray();
		char firstIndex=ch[0];
		for(int i=0;i<ch.length-1;i++)
		{
			ch[i]=ch[i+1];
		}
		ch[ch.length-1]=firstIndex;
		return new String(ch);

	}

	public static boolean checkRotation(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}

		String rotatedStr=str1;

		for(int i=0;i<str1.length();i++)
		{
			rotatedStr=rotateString(rotatedStr);

			if(str2.equals(rotatedStr))
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		String str1 = "waterbottle";
		String str2 = "erbottlewat";

		System.out.println("Is Rotation: " + checkRotation(str1, str2));

	}


}
