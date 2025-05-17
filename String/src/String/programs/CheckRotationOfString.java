package String.programs;

//Check Rotation of String
//Input: 'waterbottle', 'erbottlewat' => Output: true

public class CheckRotationOfString 
{
	public static boolean checkRotation(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			return false;
		}
		String combined=str1+str1;

		return combined.contains(str2);
	}
	public static void main(String[] args)
	{
		String str1 = "waterbottle";
		String str2 = "erbottlewat";

		System.out.println("Is Rotation: " + checkRotation(str1, str2));
	}

}
