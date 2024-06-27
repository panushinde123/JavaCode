package Basic;

import java.util.Scanner;

public class methodtype2 {

	void multiply(int num1,int num2 ,int num3)
	{
		int res=num1*num2*num3;
		System.out.println(res);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 numbers:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		methodtype2 m=new methodtype2();
		m.multiply(x, y, z);

	}

}
