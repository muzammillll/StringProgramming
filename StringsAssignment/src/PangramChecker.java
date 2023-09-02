public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println(input + " is a pangram.");
        } else {
            System.out.println(input + " is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        // Converting the input string to lowercase
        str = str.toLowerCase();

        //   only lowercase letters
        boolean[] alphabet = new boolean[26];

        // Iterating through the characters in the string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Checking if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                // Mark the corresponding index as true in the alphabet array
                alphabet[c - 'a'] = true;
            }
        }

        // Checking if all letters in the alphabet array are true (i.e., they all occurred)
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}
