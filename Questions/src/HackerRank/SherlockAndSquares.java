package HackerRank;

public class SherlockAndSquares 
{
	public static int squares(int a, int b)
	{
		int count=0;
		for(int i=1;i*i<=b;i++)
		{
			int sq=i*i;
			if(sq>=a && sq<=b)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args)
	{
		System.out.println(squares(24,49));  // 3
		System.out.println(squares(17,24));  // 0
		System.out.println(squares(3,9));    // 2
	}

}
