package OOPS;

class P{
	String name;
	int id;
	float marks;
	
	P(String n,int i,float m)
	{
		name=n;
		id=i;
		marks=m;	
	}
}
class Q extends P{
	Q( String name,	int id,float marks)
	{
		super(name,id,marks);
	}
	
	void display()
	{
		System.out.println(" "+name+" "+id+" "+marks);
	}
}
public class SuperExample2 {
	public static void main(String[] args) {
		Q q=new Q("Pranita",101,98.0f);
		q.display();
	}
}
