package String;

public class gettinglength {

	 public static void main(String[] args) {
	        String input = "example"; // Input string
	        int length = getLength(input); // Call method to get length
	        System.out.println("Length of the string: " + length);
	    }
	    
	    public static int getLength(String str) {
	        try {
	         
	            String rem = str.substring(1);
	         
	           
	            return 1 + getLength(rem);
	        } 
	        catch (StringIndexOutOfBoundsException e) {
	    
	            return 0;
	        }
	    }
	}



