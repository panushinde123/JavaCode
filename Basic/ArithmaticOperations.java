package Basic;

import java.util.Scanner;

public class ArithmaticOperations {

	public static void Addition(int num1,int num2)
	{
		int z=num1+num2;
		System.out.println("Addition :"+z);
	}
	
	public static void Substraction(int num1,int num2)
	{
		int z=num1-num2;
		System.out.println("Substraction :"+z);
	}
	public static void Multiplication(int num1,int num2)
	{
		int z=num1*num2;
		System.out.println("Multiplication :"+z);
	}
	public static void Division(int num1,int num2)
	{
		int z=num1/num2;
		System.out.println("Division :"+z);
	}
	public static void Modulus(int num1,int num2)
	{
		int z=num1%num2;
		System.out.println("Modulus :"+z);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		Addition(x,y);
		Substraction(x,y);
		Multiplication(x,y);
		Division(x,y);
		Modulus(x,y);

	}

}
