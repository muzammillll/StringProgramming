public class UniqueCharactersChecker {
    public static void main(String[] args) {
        String input = "abcdefg"; // Replace with your input string
        
        boolean hasUniqueCharacters = hasUniqueCharacters(input);

        if (hasUniqueCharacters) {
            System.out.println(input + " contains all unique characters.");
        } else {
            System.out.println(input + " does not contain all unique characters.");
        }
    }

    public static boolean hasUniqueCharacters(String str) {
        // Assuming the string contains only ASCII characters (0-127)
        if (str.length() > 128) {
            return false; 
        }

        boolean[] charSet = new boolean[128]; // Initializng a boolean array for each ASCII character

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (charSet[c]) {
                return false; // If the character has already been encountered, it's not unique
            }

            charSet[c] = true;
        }

        return true; // If no duplicates were found, the string has all unique characters
    }
}
