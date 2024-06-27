package OOPS;

import java.util.Scanner;

public class methodtype4 {

	int add()
	{
		int num1=10;int num2=9;
		int res=num1+num2;
		return res;	
	}
	int sub()
	{
		int num1=10,num2=9;
		int res=num1-num2;
		return res;	
	}
	int mul()
	{
		int num1=10,num2=9;
		int res=num1*num2;
		return res;	
	}
	int div()
	{
		int num1=10,num2=9;
		int res=num1/num2;
		return res;	
	}
	int mod()
	{ 
		int num1=10,num2=9;
		int res=num1%num2;
		return res;	
	}
	public static void main(String[] args) {
		
		methodtype4 m=new methodtype4();
		int a=m.add();
		System.out.println("Addition is: "+a);
		int b=m.sub();
		System.out.println("Substraction is:"+b);
		int c=m.mul();
		System.out.println("Multiplication is:"+c);
		int d=m.div();
		System.out.println("Division is:"+d);
		int e=m.sub();
		System.out.println("Modulus is:"+e);
		
		
	}

}
