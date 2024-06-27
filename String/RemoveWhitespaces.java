package String;

import java.util.Scanner;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
	   String ch=s.replaceAll("\\s", "");
	   System.out.println("After Removing WhiteSpaces: "+ch);

	}

}
