package String;
public class equalsOrNot {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bacd";

        boolean result1 = compareStrings(s1, s2);
        System.out.println(result1); // false

//        String s3 = "abcd";
//        boolean result2 = compareStrings(s1, s3);
//        System.out.println(result2); // true
    }

    public static boolean compareStrings(String s1, String s2) {
        // Check if the lengths of the strings are equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Iterate through each character of the strings and compare
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        // If no differences are found, return true
        return true;
    }
}
