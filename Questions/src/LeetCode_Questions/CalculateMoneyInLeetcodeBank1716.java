package LeetCode_Questions;

// LeetCode: 1716. Calculate Money in Leetcode Bank

public class CalculateMoneyInLeetcodeBank1716 
{
	public static int totalMoney(int n)
	{
		int a = 1;
		int d = 1;

		int sum = 0;

		while (n > 0) {
			int days = Math.min(n, 7);

			sum += ((days * (2 * a + (days - 1) * d)) / 2);
			a += 1;
			n = n - 7;
		}

		return sum;

	}
	public static void main(String[] args)
	{
		System.out.println(totalMoney(4));  // 10
		System.out.println(totalMoney(10)); // 37
		System.out.println(totalMoney(20)); // 96
	}

}
