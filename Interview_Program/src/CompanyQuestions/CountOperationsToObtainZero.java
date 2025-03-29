package CompanyQuestions;



public class CountOperationsToObtainZero 
{
	public static int countOperations(int num1, int num2) 
	{
		int count=0;
		int result;
		while(num1>0 && num2>0)
		{
			if(num1>num2)
			{
				result=num1-num2;
				count++;
				num1=result;
			}
			else
			{
				result=num2-num1;
				count++;
				num2=result;
			}

		}
		return count;
	}
	public static void main(String[] args)
	{
		System.out.println(countOperations(2,3));  // output 3
		System.out.println(countOperations(10,10));  // output 1
	}


}
