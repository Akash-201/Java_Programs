package InterviewerAsked;

// input: This is java
// output: java is This

public class ReverseSentence 
{
    public static void reverseSentence(String s1)
    {
        String[] s2 = s1.split(" ");
        String reverse = "";
        for (int i = s2.length - 1; i >= 0; i--) 
        {
            reverse += s2[i] + " ";
        }
        System.out.println(reverse.trim());
    }

    public static void main(String[] args) 
    {
        String s1 = "This is java";
        reverseSentence(s1);
    }
}
