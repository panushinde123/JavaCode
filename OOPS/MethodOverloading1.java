package OOPS;

public class MethodOverloading1 {
	
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
	String add(String s,String s1)
	{
		return s+s1;
	}
	public static void main(String[] args) {
		MethodOverloading1 t1=new MethodOverloading1();
		System.out.println(t1.add(10,20));
		System.out.println(t1.add(1.2,3.4));
		System.out.println(t1.add("Rohit","Sharma"));
		
	}

}
