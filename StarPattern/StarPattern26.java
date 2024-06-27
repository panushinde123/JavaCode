//*****
//****
//***
//**
//*
//**
//***
//****
//*****
package StarPattern;

public class StarPattern26 {

	public static void main(String[] args) {
		
		int end=5;
		
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=end;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		
		if(i<5)
			end--;
		else
			end++;
		}
		
//		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=5;j>=i;j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
