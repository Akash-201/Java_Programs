//Given two numbers A and B, WAJP to find the Kth digit from the right of A^B.
//•	Input: A = 3, B = 3, K = 1
//•	Output: 7


package Important.programs;

public class Kth_Digit_Of_AandB 
{
	public static void print(int a,int b,int k)
	{
		long multi=1;
		for(int i=1;i<=b;i++)
		{
			multi=multi*a;

		}
		String result=Long.toString(multi);
		if(k > result.length())
		{
			System.out.println("Invalid K: out of range");
		}
		else {

			for(int i=1;i<=k;i++)
			{
				long rem=multi%10;
				if(i==k)
				{
					System.out.println(rem);
					break;

				}
				multi/=10;

			}
		}
	}
	public static void main(String[] args) {
		print(3,4,2);
	}

}
