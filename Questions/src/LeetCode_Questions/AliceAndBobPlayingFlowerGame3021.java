package LeetCode_Questions;

// LeetCode: 3021. Alice and Bob Playing Flower Game

public class AliceAndBobPlayingFlowerGame3021
{
	public static  long flowerGame(int n, int m) 
	{
		long oddN = (n + 1) / 2;   
		long evenN = n / 2;       
		long oddM = (m + 1) / 2;   
		long evenM = m / 2;       

		return oddN * evenM + evenN * oddM;

	}
	public static void main(String[] args) {

		System.out.println(flowerGame(3, 2));
		System.out.println(flowerGame(1, 1));
		
		
	}

}
