package LeetCode_Questions;

// LeetCode: 1518. Water Bottles

public class WaterBottles1518 
{
	public static int numWaterBottles(int numBottles, int numExchange)
	{
		int result = numBottles; 
		int emptyWB = numBottles;

		while (emptyWB >= numExchange) 
		{

			int newWB = emptyWB / numExchange; 
			result += newWB;
			emptyWB = newWB + (emptyWB % numExchange);
		}
		return result;
	}
	public static void main(String[] args)
	{
		System.out.println(numWaterBottles(9,3));  // 13
		System.out.println(numWaterBottles(15,4)); // 19

	}

}
