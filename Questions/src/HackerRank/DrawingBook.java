package HackerRank;

public class DrawingBook 
{
	public static int pageCount(int n, int p) {
		int count1=0;
		int count2=0;
		for(int i=0;i<=n;i++)
		{
			if(i==p || i+1==p)
			{
				break;
			}
			count1++;
			i++;
		}
		if(n%2==0)
		{
			for(int i=n+1;i>0;i--)
			{
				if(i==p || i-1==p)
				{
					break;
				}
				count2++;
				i--;
			}
		}
		else{
			for(int i=n;i>=0;i--)
			{
				if(i==p || i-1==p)
				{
					break;
				}
				count2++;
				i--;
			}
		}
		if(count1 ==0 || count2==0)
		{
			return 0;
		}
		return Math.min(count1,count2);
	}
	public static void main(String[] args)
	{
		System.out.println(pageCount(5,3)); // 1
		System.out.println(pageCount(5,4)); // 0
	}

}
