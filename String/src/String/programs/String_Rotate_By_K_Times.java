package String.programs;

public class String_Rotate_By_K_Times
{
	public static String rotate(String s1) // here we take String Return type
	{
		char[] ch=s1.toCharArray();
		char firstIndex=ch[0];
		
		for(int i=0;i<ch.length-1;i++)
		{
			ch[i]=ch[i+1];
		}
		
		ch[ch.length-1]=firstIndex;
		
		return new String(ch);  // return new String, because String is immutable
 	}
	
	public static void rotateByK(String s1,int k)
	{
		for(int i=1;i<=k;i++)
		{
			s1=rotate(s1);  // update s1 with this rotated version
		}
		System.out.println(s1);  // Now it prints the rotated string
	}
	
	
	public static void main(String[] args) {
		String s1="hello";
		int k=2;
		
		rotateByK(s1,k);
		
		
	}

}
