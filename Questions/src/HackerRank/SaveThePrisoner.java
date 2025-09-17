package HackerRank;

public class SaveThePrisoner 
{
	public static int saveThePrisoner(int n, int m, int s)
	{
		int last = (s + m - 1);

		if (last % n == 0) 
		{
			return n;
		} 
		else 
		{
			return last % n;
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println(saveThePrisoner(5,2,1));  // 2
		System.out.println(saveThePrisoner(5,2,2));  // 3
		
	}
}
