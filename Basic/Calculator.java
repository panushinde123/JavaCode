package Basic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number :");
		int num1=sc.nextInt();
		
		System.out.println("Enter operator");
		char operator=sc.next().charAt(0);
		
		System.out.println("Enter 2nd number :");
		int num2=sc.nextInt();
		
		System.out.println("\n");
		
		if(operator=='+')
		{
			System.out.println("Addition is :"+(num1+num2));
		}
		else if(operator=='-')
		{
			System.out.println("Substraction is :"+(num1-num2));
		}
		else if(operator=='*')
		{
			System.out.println("Multiplication is :"+(num1*num2));
		}
		else if(operator=='/')
		{
			System.out.println("Division is :"+(num1/num2));
		}
		else
		{
			System.out.println("Wrong Operator");
		}
	}

}
