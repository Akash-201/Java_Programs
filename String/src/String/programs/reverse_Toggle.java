package String.programs;

// input:-  my name is ajay
// output:- YM EMAN SI YAJA

public class reverse_Toggle {
    public static void reverseToggle(String s1) {
        String[] s2 = s1.split(" ");
        String afterReverse = "";

        for (int i = 0; i < s2.length; i++) {
            String word = s2[i];
            char[] wordLetter = word.toCharArray();
            String reversedWord = "";

            // Reverse the word
            for (int j = wordLetter.length - 1; j >= 0; j--) {
                char ch = wordLetter[j];

                // Toggle case while reversing
                if (Character.isUpperCase(ch)) {
                    reversedWord += Character.toLowerCase(ch);
                } else {
                    reversedWord += Character.toUpperCase(ch);
                }
            }

            // Add space between words
            afterReverse += reversedWord + " ";
        }

        // Print final result (trim to remove extra space at the end)
        System.out.println(afterReverse.trim());
    }

    public static void main(String[] args) {
        String input = "my name is ajay";
        reverseToggle(input);
    }
}
