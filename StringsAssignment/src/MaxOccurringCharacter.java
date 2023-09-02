public class MaxOccurringCharacter {
    public static void main(String[] args) {
        String input = "Ineuron"; 
        
        char maxChar = findMaxOccurringCharacter(input);

        System.out.println("Input String: " + input);
        System.out.println("Maximum Occurring Character: " + maxChar);
    }

    public static char findMaxOccurringCharacter(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string is null or empty.");
        }

        int[] charCount = new int[256]; // Assuming ASCII characters

       
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCount[c]++;
        }

        char maxChar = str.charAt(0);
        int maxCount = charCount[maxChar];

    
        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charCount[c] > maxCount) {
                maxChar = c;
                maxCount = charCount[c];
            }
        }

        return maxChar;
    }
}
