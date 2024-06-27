package String;

public class FrontBackTransformation {
	
	    public static String frontBackTransformation(String S) {
	        StringBuilder result = new StringBuilder();
	        
	        for (char ch : S.toCharArray()) 
	        {
	            if (Character.isLowerCase(ch))
	            {
	                result.append((char) (219 - ch));
	            } else if (Character.isUpperCase(ch))
	            {
	                result.append((char) (155 - ch));
	            } else
	            {
	                result.append(ch);
	            }
	        }
	        return result.toString();
	    }

	    public static void main(String[] args) {
	        String S = "Hello";
	        System.out.println(frontBackTransformation(S)); // Output: Svool
	    }
	}
