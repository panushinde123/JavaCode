package String;

public class ContainsOnlyDigits {

	public static void main(String[] args) {
		String s="abc123";
		if(containsDigitOnly(s))
			System.out.println("only digits");
		else 
			System.out.println("not only digits");

	}

	private static boolean containsDigitOnly(String s) {
		
		return (s.matches("[0-9]+"));
	}

}

