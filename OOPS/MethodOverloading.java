package OOPS;
public class MethodOverloading
{
	void sum(int x,int y) 
	{
		System.out.println(x+y);	
	}
	void sum(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	public static void main(String[] args)
	{
		
          MethodOverloading m=new MethodOverloading();
           m.sum(10, 20);
           m.sum(10, 20, 30);
	
	}

}
