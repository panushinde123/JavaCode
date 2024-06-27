package String;

import java.util.Arrays;

public class SortNumbersInString {

	public static void main(String[] args) {
	String str="43625pranita358";
	char[] ch=str.toCharArray();
	Arrays.sort(ch);
	System.out.println(ch);
	System.out.println(Arrays.toString(ch));
	}

}
