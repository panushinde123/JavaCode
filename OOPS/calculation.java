package OOPS;

import java.util.Scanner;

public class calculation {

	int add(int num1,int num2)
	{
		int res=num1+num2;
		return res;	
	}
	
	int sub(int num1,int num2)
	{
		int res=num1-num2;
		return res;	
	}
	int mul(int num1,int num2)
	{
		int res=num1*num2;
		return res;	
	}
	int div(int num1,int num2)
	{
		int res=num1/num2;
		return res;	
	}
	int mod(int num1,int num2)
	{
		int res=num1%num2;
		return res;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Values:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		calculation m=new calculation();
		int a=m.add(x, y);
		System.out.println("Addition is: "+a);
		int b=m.sub(x, y);
		System.out.println("Substraction is:"+b);
		int c=m.mul(x, y);
		System.out.println("Multiplication is:"+c);
		int d=m.div(x, y);
		System.out.println("Division is:"+d);
		int e=m.sub(x, y);
		System.out.println("Modulus is:"+e);
		

	}

}
