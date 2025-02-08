package String.programs;

// input:- this is java
// output:- tHIS iS jAVA

public class Toggle_Each_Word
{
	public static void toggleWord(String s1)
	{
		String[] s2=s1.split(" ");
		String afterToggle="";
		 
		for(int i=0;i<s2.length;i++)
		{
			String word=s2[i];
			if(word.length()>0)
			{
				String firstLetter=word.substring(0,1).toLowerCase();
				String afterConvertion=word.substring(1).toUpperCase();
				afterToggle+=firstLetter+afterConvertion+" ";
			}
			
		}
		
		afterToggle=afterToggle.trim();
		System.out.println("Before Toggle: "+s1);
		System.out.println("After Toggle: "+afterToggle);
		
	}
	public static void main(String[] args) {
		String s1="this is java";
		toggleWord(s1);
	}

}
