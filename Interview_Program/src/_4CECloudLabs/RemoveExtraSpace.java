package _4CECloudLabs;

public class RemoveExtraSpace
{
	public static void main(String[] args)
	{
		String before="  This     Is    Java";
		
		 //replace multiple spaces with a single space
		String after=before.trim().replaceAll("\\s+"," ");
		
		System.out.println(after);
		
	}

}
