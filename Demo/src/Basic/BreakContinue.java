package Basic;

public class BreakContinue 
{
	public static void main(String[] args) {
		
		for(int i=10;i<=50;i++)
		{
			
			if(i%5==0)
			{
				continue;
			}
			System.out.print(i+" ");
			
			if(i==44)
			{
				break;
			}
		}
	}

}
