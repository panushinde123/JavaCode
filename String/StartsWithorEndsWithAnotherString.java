//program to check whether the given string starts with or ends with contents of another string.
package String;

public class StartsWithorEndsWithAnotherString {

	public static void main(String[] args) {
		String str="My name is Pranita";
		String str1="My";
		String str2="Pranita";
		
		if(str.startsWith(str1))
			System.out.println("String str starts with content of another string");
		else
			System.out.println("String str doesn't starts with another string");
		
		System.out.println();
		
		if(str.endsWith(str2))
			System.out.println("String str ends with content of another string");
		else
			System.out.println("String str doesn't ends with another string");
		
		
	}

}
