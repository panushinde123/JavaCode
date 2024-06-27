package String;

import java.util.Arrays;

public class stringMethods {

	public static void main(String[] args) {
		
	String s1="hefshine";
	String str="hefshine";
	
	int p=s1.lastIndexOf('e', 3);
	System.out.println(p);
	
	String ss=s1.repeat(2);
	System.out.println(ss);
	
     boolean t=s1.equals(str);
     System.out.println(t);
     
	String sss="ab ab abc";
	int z=sss.indexOf("a", 4);
	System.out.println(z);
	
	int compare=s1.compareTo(str);
	System.out.println(compare);
	
	String[] split=s1.split("e");
	System.out.println(Arrays.toString(split));
	
	String trim=s1.trim();
	System.out.println(trim);
	
	String upper=str.toUpperCase();
	System.out.println(upper);
	
	String lower=upper.toLowerCase();
	System.out.println(lower);
	
	String s3=s1.replace('e', 'i');
	System.out.println(s3);
	
	int length=s1.length();
	System.out.println(length);
	
	boolean blank=s1.isBlank();
	System.out.println(blank);
	
	boolean empty=s1.isEmpty();
	System.out.println(empty);
	
	char ch=s1.charAt(3);
    System.out.println(ch);
    
    String l=s1.concat(str);
    System.out.println(l);
    
////   String s2=s1.concat("software");
////    System.out.println(s2);
    
    int codepoint=s1.codePointAt(4);
    System.out.println(codepoint);
    
    int lastIndex=s1.lastIndexOf("e");
    System.out.println(lastIndex);
    
    int firstindex=s1.indexOf("e");
    System.out.println(firstindex);
    
    boolean equals=s1.equals("Hefshine");
    System.out.println(equals);
    
    boolean startWith=s1.startsWith("hef");
    System.out.println(startWith);
    
    boolean endsWith=s1.endsWith("shine");
    System.out.println(endsWith);
	}

}
