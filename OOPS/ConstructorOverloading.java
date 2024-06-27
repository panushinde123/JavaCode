package OOPS;
class Employeee
{
	int id;
	String name;
	int salary;
	Employeee()
	{
		this(null,0,8000);
	}
	Employeee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	Employeee(String name,int id,int salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void display()
	{
		System.out.println(name+" "+id+" "+salary);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Employeee e1=new Employeee();
		e1.display();
        Employeee e2=new Employeee("Ram",100);
        e2.display();
        Employeee e3=new Employeee("Sham",101,10000);
        e3.display();
	}

}
