package LeetCode_Questions;

// LeetCode: 2043. Simple Bank System

public class SimpleBankSystem2043
{
	long[] balance;
	int n;

	public  SimpleBankSystem2043(long[] balance)
	{
		this.balance = balance;
		n = balance.length;
	}

	public boolean transfer(int account1, int account2, long money) 
	{
		if (account1 <= n && account2 <= n) 
		{
			long b = balance[account1 - 1];

			if (b >= money) 
			{
				balance[account1 - 1] -= money;
				balance[account2 - 1] += money;
				return true;
			}
		}

		return false;
	}

	public boolean deposit(int account, long money)
	{
		if (account <= n) 
		{
			balance[account - 1] += money;
			return true;
		}

		return false;
	}

	public boolean withdraw(int account, long money) 
	{
		if (account <= n) 
		{
			long b = balance[account - 1];
			if (b >= money)
			{
				balance[account - 1] -= money;
				return true;
			}
		}

		return false;
	}
	
	public static void main(String[] args) 
	{
		// Input: [10, 100, 20, 50, 30]
		long[] initialBalance = {10, 100, 20, 50, 30};

		SimpleBankSystem2043 bank = new SimpleBankSystem2043(initialBalance);

		System.out.println(bank.withdraw(3, 10));    // true
		System.out.println(bank.transfer(5, 1, 20)); // true
		System.out.println(bank.deposit(5, 20));     // true
		System.out.println(bank.transfer(3, 4, 15)); // false
		System.out.println(bank.withdraw(10, 50));   // false
		
		
	}

}
