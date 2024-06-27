package OOPS;
class Person
{
	String name;
	int id;
	Person()
	{
		this("Pranali",103);
	}
	Person(String name)
	{
		this(name,102);
	}
	Person(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	void show()
	{
		System.out.println(name+" "+id);
	}
}
public class ThisExample7 {

	public static void main(String[] args) {
		Person p1=new Person("Pankaj",101);
		p1.show();
		Person p2=new Person("Priya");
		p2.show();
		Person p3=new Person();
		p3.show();
	}

}
