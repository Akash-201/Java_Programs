package NumberPrograms;
//swaps two numbers without using a third variable  


public class SwapTwoNumber4
{
	public static void swapTwoNumber(int a,int b)
	{
		System.out.println("Before Swap: a = " + a + ", b = " + b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swap: a = " + a + ", b = " + b);
	}
	public static void main(String[] args)
	{
		swapTwoNumber(12,84);
	}

}
