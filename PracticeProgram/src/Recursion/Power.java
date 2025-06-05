package Recursion;

public class Power 
{
	public static int findAnswer(int p,int q)
	{
		// Base case
		if(q==0)
			return 1;
		
		return findAnswer(p,q-1)*p;
	}
	public static void main(String[] args)
	{
		int p=5;
		int q=3;
		System.out.print(findAnswer(p,q));
	}
	

}
