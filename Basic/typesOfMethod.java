package Basic;

import java.util.Scanner;

public class typesOfMethod {

	
	public static void sum(int num1,int num2)
	{
		int z=num1+num2;
		System.out.println(z);
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two Numbers:");
	int x=sc.nextInt();
	int y=sc.nextInt();
	sum(x,y);
	

	}

}
