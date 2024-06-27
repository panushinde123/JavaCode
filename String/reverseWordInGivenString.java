package String;

import java.util.Arrays;

public class reverseWordInGivenString {

	public static void main(String[] args) {
		String s1="you all are very very very good students";
		
		//reverse every word in a sentence
		String[] rev=s1.split(" ");
		String newstr="";
		System.out.println(Arrays.toString(rev));
		for(int i=rev.length-1;i>=0;i--)
		{
		   newstr=newstr+rev[i]+" ";
		}
		System.out.println(newstr);
		
		//reverse every character of a sentence
		char[] ch=newstr.toCharArray();
		String ch1="";
		for(int i=ch.length-1;i>=0;i--)
		{
		   ch1=ch1+ch[i];
		}
		System.out.println(ch1);

	}

}
