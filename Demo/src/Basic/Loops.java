package Basic;

public class Loops 
{
	public static void main(String[] args)
	{
		
		// for loop
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		// while loop
		int i=101;
		while(i<=110)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		//do-while loop
		int j=201;
		do {
			System.out.print(j+" ");
			j++;
		}while(j<=210);
		System.out.println();
		
//		for-Each loop
		int[] nums= {10,20,30,40,50};
		for(int x : nums)
		{
			System.out.print(x+" ");
		}
		
		
	}
	

}
