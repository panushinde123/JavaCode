package OOPS;

public class constructor {
	String name;
	int id;
	String email;
	
	constructor()
	{
		name="Pranali";
		id=101;
		email="abc";
	}
	constructor(String a,int b,String c)
	{
		name=a;
		id=b;
		email=c;	
	}																
	public static void main(String[] args) {
		constructor c=new constructor();
		System.out.println(c.name+" "+c.id+" "+c.email);
		
		constructor c1=new constructor("Pranita",102,"xyz");
		System.out.println(c1.name+" "+c1.id+" "+c1.email);	
	}

}
