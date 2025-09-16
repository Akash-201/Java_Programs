package HackerRank;

public class UtopianTree 
{
	public static int utopianTree(int n) 
	{
		int height=1;
		for(int cycles=1;cycles<=n;cycles++)
		{
			if(cycles % 2 !=0)
			{
				height=height*2;
			}
			else{
				height=height+1;
			}
		}
		return height;

	}
	public static void main(String[] args) 
	{
		System.out.println(utopianTree(5));  // 14
		System.out.println(utopianTree(4));  // 7
		
	}

}
