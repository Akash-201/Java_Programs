package LeetCode_Questions;

public class MaximumNumberOfWordsYouCanType1935 
{
	public static int canBeTypedWords(String text, String brokenLetters)
    {
         String[] words = text.split(" ");

        int brokenWords = 0;
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (brokenLetters.indexOf(c) != -1) {
                    brokenWords += 1;
                    break;
                }
            }
        }

        return words.length - brokenWords;
    }
        
    public static void main(String[] args) {
		String text="Hello World";
		String brokenLetters="ad";
		System.out.println(canBeTypedWords(text, brokenLetters));
	}

}
