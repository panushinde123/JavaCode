package String;
public class FirstLetters {
    public static String firstLetters(String S) {
        StringBuilder result = new StringBuilder();

        // Split the string by space
        String[] words = S.split(" ");

        // Iterate through each word
        for (String word : words) {
            // Append the first character of each word to the result string
            result.append(word.charAt(0));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String S1 = "geeks for geeks";
        String S2 = "bad is good";

        System.out.println("Output for S1: " + firstLetters(S1)); // Output: gfg
        System.out.println("Output for S2: " + firstLetters(S2)); // Output: big
    }
}

