package String;

public class PrintFirstCharacter 
{
	public static void printFirstCharacter(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				if(i==0 || str.charAt(i-1)==' ')
				{
					System.out.print(str.charAt(i)+" ");
				}
			}
		}
	}
	public static void main(String[] args)
	{
		String str="Koi Mil Gaya";
		printFirstCharacter(str);
	}

}
