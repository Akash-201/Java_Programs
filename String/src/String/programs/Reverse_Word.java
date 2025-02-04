package String.programs;

public class Reverse_Word
{
	public static void reverse(String s1)
	{
		String[] s2=s1.split(" ");
		String s3="";
		
		for(int i=s2.length-1;i>=0;i--)
		{
			s3=s3+s2[i]+" ";
		}
		
		System.out.println(s3);
		
		
	}
	public static void main(String[] args) {
		reverse("Hello World");
	}

}
