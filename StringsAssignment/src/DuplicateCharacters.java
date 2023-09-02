
public class DuplicateCharacters {

 
	    public static void main(String[] args) {
	        String inputString = "communication"; 

	        System.out.println("Original String: " + inputString);
	        System.out.println("Duplicate Characters: ");
	        printDuplicateCharacters(inputString);
	    }

	    public static void printDuplicateCharacters(String input) {
	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);

	            
	            if (currentChar != ' ') {
	                for (int j = i + 1; j < input.length(); j++) {
	                    if (currentChar == input.charAt(j)) {
	                        System.out.println(currentChar);
	                        break; 
	                    }
	                }
	            }
	        }
	    }
	}


	


