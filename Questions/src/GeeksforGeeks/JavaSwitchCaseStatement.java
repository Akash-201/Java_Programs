package GeeksforGeeks;

import java.util.Arrays;
import java.util.List;

public class JavaSwitchCaseStatement 
{
	public static double switchCase(int choice, List<Double> arr)
	{
		switch(choice)
		{
		case 1:
			double R=arr.get(0);
			return Math.PI*R*R;

		case 2:
			double L=arr.get(0);
			double B=arr.get(1);
			return L*B;

		default:

			System.out.println("Invalid"); 
			return 0;
		}

	}
	public static void main(String[] args) 
	{
		List<Double> arr=Arrays.asList(5.0);
		System.out.println(switchCase(1,arr));  // 78.53981633974483

		List<Double> arr2=Arrays.asList(5.0,10.0);
		System.out.println(switchCase(2,arr2)); // 50.0

	}

}
