package InterviewerAsked;

//Task: Need to avoid single instance characters, spaces and it is case sensitive
//You need to print - character name - count

public class CharacterCountInSentence 
{
	public static void countCharacter(String str)
	{
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
				continue;
			
			int count=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=' ';
				}
				
			}
			if(count>1)
			{
				System.out.println(ch[i]+" --> "+count);
			}
			
		}
		
	}
	public static void main(String[] args)
	{
		String str="Akash is a software engineer";
		countCharacter(str);
	}

}
