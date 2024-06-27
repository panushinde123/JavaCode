package String;

public class matchesMethod {

	public static void main(String[] args) {
		String s="ABC";
		if(s.matches("[0-9]+"))
		{
			System.out.println("Only digits are available");
		}
		else if((s.matches("[a-z]+"))||(s.matches("[A-Z]+")))
		{
			System.out.println("Only Characters are available");
		}
		else
			System.out.println("Digits and Characters are available");
	}

}
