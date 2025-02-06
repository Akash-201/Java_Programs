package String.programs;

public class Remove_Vowels
{
	public static void remove(String s)
	{
		char[] ch=s.toLowerCase().toCharArray();
		String s2="";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='a' && ch[i]!='e' &&  ch[i]!='i' && ch[i]!='o' && ch[i]!='u' )
			{
				s2=s2+ch[i];
			}
		}
		System.out.println("Original String:- "+s);
		System.out.println("After Removing Vowels:- "+s2);
	}
	
	public static void main(String[] args) {
		String s="Hello";
		remove(s);
	}

}
