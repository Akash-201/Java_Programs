package NumberPrograms;
// using third variable

public class SwapTwoNumber 
{
	public static void swapNumber(int a,int b)
	{
		System.out.println("Before Swap: a = " + a + ", b = " + b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap: a = " + a + ", b = " + b);

	}
	public static void main(String[] args) {
		swapNumber(10,20);
	}

}
