package Basic;

import java.util.Scanner;

public class methodss {

	public static void evenOdd(int num)
	{
		if(num%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");
	}
	
	public static void vowelConsonant(char c)
	{
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			System.out.println("vowel");
		else
			System.out.println("consonant");
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number :");
	int x=sc.nextInt();
	
	evenOdd(x);

	}

}
