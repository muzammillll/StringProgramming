public class CountCharacters {
    public static void main(String[] args) {
        String input = "Hello, India! 321"; // Replace with the string you want to analyze

        int vowels = 0;
        int consonants = 0;
        int specialChars = 0;

        input = input.toLowerCase(); // Converting the string to lowercase for easier vowel checking

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (!Character.isWhitespace(ch)) {
                specialChars++;
            }
        }

        System.out.println("Input String: " + input);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special Characters: " + specialChars);
    }
}
