package HackerRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HackerRankLanguage 
{

	public static void validHackerRankLanguage(String s)
	{
		Set<String> validLanguages = new HashSet<>(Arrays.asList(
				"C", "CPP", "JAVA", "PYTHON", "PERL", "PHP", "RUBY", "CSHARP",
				"HASKELL", "CLOJURE", "BASH", "SCALA", "ERLANG", "CLISP",
				"LUA", "BRAINFUCK", "JAVASCRIPT", "GO", "D", "OCAML", "R",
				"PASCAL", "SBCL", "DART", "GROOVY", "OBJECTIVEC"
				));
		
		String[] parts=s.split(" ");
		String word=parts[1];

		if (validLanguages.contains(word)) 
		{
			System.out.println("VALID");
		} 
		else 
		{
			System.out.println("INVALID");
		}
	}

	public static void main(String[] args) 
	{
		validHackerRankLanguage("11044 X");  // INVALID
		validHackerRankLanguage("11022 BRAINFUCK"); // VALID
		validHackerRankLanguage("11011 LUA");  // VALID


	}

}
