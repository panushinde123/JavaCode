package OOPS;

import java.util.Scanner;

public class methodType3 {

	int sum()
	{
		int num1=2,num2=5;
		int res=num1+num2;
		return res;
	}
	
	int sum(int num1,int num2)
	{
		int res=num1+num2;
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		methodType3 m=new methodType3();
		
		int s=m.sum();
		System.out.println(s);
		
		int z=m.sum(x, y);
		System.out.println(z);
	}

}
