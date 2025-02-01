package String.programs;

public class Count_Upper_Lower_Number_Special 
{
	public static void count(String str)
	{
		int upper=0;
		int lower=0;
		int special=0;
		int number=0;

		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=90)
			{
				upper++;
			}
			else if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				lower++;
			}
			else if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				number++;
			}
			else
			{
				special++;
			}
		}
		System.out.println("upper = "+upper);
		System.out.println("lower = "+lower);
		System.out.println("number = "+number);
		System.out.println("special = "+special);
	}
	public static void main(String[] args) {
		count("akakJFTK97@%(3  ");
	}

}
