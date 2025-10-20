package LeetCode_Questions;

// LeetCode: 2011. Final Value of Variable After Performing Operations

public class FinalValueOfVariableAfterPerformingOperations2011 
{
	public static int finalValueAfterOperations(String[] operations) 
	{
		int x = 0;
		for (String o : operations) 
		{
			if (o.equals("++X") || o.equals("X++"))
			{
				x += 1;
			} else if (o.equals("--X") || o.equals("X--"))
			{
				x -= 1;
			}
		}
		return x;
	}
	public static void main(String[] args)
	{
		String[] operations= {"--X","X++","X++"};
		System.out.println(finalValueAfterOperations(operations));  // 1

		String[] operations2= {"++X","++X","X++"};
		System.out.println(finalValueAfterOperations(operations2)); // 3

		String[] operations3= {"X++","++X","--X","X--"};
		System.out.println(finalValueAfterOperations(operations3)); // 0


	}

}
