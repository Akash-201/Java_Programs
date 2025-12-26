package Important.programs;

public class PowerOf2 
{
	public static boolean checkNumber(int n)
	{
		while(n>1 && n%2==0)
		{
			n/=2;
		}
		return n==1;

	}
	public static void main(String[] args)
	{
		System.out.println(checkNumber(16));  // true
		System.out.println(checkNumber(18));  // false
		System.out.println(checkNumber(32));  // true
		System.out.println(checkNumber(-7));  // false

	}

}
