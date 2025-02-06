package String.programs;

public class String_Rotation 
{
	public static void rotate(String s1)
	{
		char[] ch=s1.toCharArray();
		
		char firstElement=ch[0];
		for(int i=0;i<ch.length-1;i++)
		{
			ch[i]=ch[i+1];
			
		}
		ch[ch.length-1]=firstElement;
		System.out.println(ch);
	}
	public static void main(String[] args) {
		String s1="hello";
		rotate(s1);
	}
	
	

}
