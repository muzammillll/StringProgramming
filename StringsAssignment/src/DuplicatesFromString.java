
public class DuplicatesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
 
		     
		        String inputString = "Information"; 

		        String result = removeDuplicates(inputString);

		        System.out.println("Original String: " + inputString);
		        System.out.println("String with Duplicates Removed: " + result);
		    }

		    public static String removeDuplicates(String input) {
		        char[] chars = input.toCharArray();
		        int length = chars.length;

		        for (int i = 0; i < length; i++) {
		            for (int j = i + 1; j < length; j++) {
		                if (chars[i] == chars[j]) {
		                     
		                    for (int k = j; k < length - 1; k++) {
		                        chars[k] = chars[k + 1];
		                    }
		                    length--; 
		                    j--; 
		                }
		            }
		        }

		        return new String(chars, 0, length);
		    }
		}


	


