package HackerRank;

public class ElectronicsShop 
{
	static int getMoneySpent(int[] keyboards, int[] drives, int b)
	{
		int maxSpend=-1;
		for(int keyboardPrice : keyboards)
		{
			for(int drivePrice : drives)
			{
				int total=keyboardPrice+drivePrice;
				if(total <= b && total > maxSpend)
				{
					maxSpend = total;
				}
			}
		}
		return maxSpend;
	}
	public static void main(String[] args)
	{
		int[] keyboards= {3,1};
		int[] drives= {5,2,8};
		int b=10;
		System.out.println(getMoneySpent(keyboards, drives, b));

	}
}


