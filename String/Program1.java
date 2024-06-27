//Write a program to create a new String object with the contents of a character array 
package String;

public class Program1 {

	public static void main(String[] args) {
		char ch[]= {'a','b','c','d','e'};
		String str=new String(ch);
		System.out.println(str);
	}

}
