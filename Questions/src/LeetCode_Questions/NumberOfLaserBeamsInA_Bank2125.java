package LeetCode_Questions;

// LeetCode: 2125. Number of Laser Beams in a Bank

public class NumberOfLaserBeamsInA_Bank2125 
{
	public static int numberOfBeams(String[] bank) 
	{
		int prev = 0;
		int result = 0;

		for (String s : bank) 
		{
			int current = 0;
			for (char c : s.toCharArray()) 
			{
				if (c == '1') 
				{
					current += 1;
				}
			}

			if (current > 0) 
			{
				result += prev * current;
				prev = current;
			}
		}

		return result;

	}
	public static void main(String[] args) 
	{
		String[] bank= {"000","111","000"};
		System.out.println(numberOfBeams(bank));  // 0
		
		String[] bank2= {"011001","000000","010100","001000"};
		System.out.println(numberOfBeams(bank2));  // 8
		
	}

}
