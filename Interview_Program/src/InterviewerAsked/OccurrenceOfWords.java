package InterviewerAsked;

/* Input 1= This is java
   Input 2= This is a java
   Output= 
   this --> 2
   is --> 2
   a --> 1
   java --> 2
 */

public class OccurrenceOfWords 
{
	public static void countOccurrence(String s1,String s2)
	{
		String add=(s1+" "+s2).toLowerCase();
		String[] arr=add.split(" ");

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(" "))
				continue;
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
					arr[j]=" ";
				}
			}
			System.out.println(arr[i]+" --> "+count);

		}
	}
	public static void main(String[] args) 
	{
		String s1="This is java";
		String s2="This is a java";
		countOccurrence(s1, s2);
	}
}
