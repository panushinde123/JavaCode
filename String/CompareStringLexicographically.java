/*
https://chat.openai.com/share/a800f894-e2ec-4a35-9c9c-e927d6f16337
 */
package String;

public class CompareStringLexicographically {

	public static void main(String[] args) {
		String s1="Pranita";
		String s2="Pranali";
		int value=s1.compareTo(s2);
		System.out.println(value);
		String s3="aB";
		String s4="Ab";
		int compare=s3.compareToIgnoreCase(s4);
		System.out.println(compare);

	}

}
