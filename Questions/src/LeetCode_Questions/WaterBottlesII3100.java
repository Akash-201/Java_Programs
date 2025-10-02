package LeetCode_Questions;

public class WaterBottlesII3100
{
	public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int result = numBottles;
       int emptyWB = numBottles;

       while (emptyWB >= numExchange) {
           emptyWB = emptyWB - numExchange;
           numExchange += 1;
           result += 1;
           emptyWB += 1;
       }

       return result;
   } 
	public static void main(String[] args) {
		System.out.println(maxBottlesDrunk(13,6));
	}

}
