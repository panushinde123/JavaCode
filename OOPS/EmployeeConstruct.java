package OOPS;

public class EmployeeConstruct {

	String name;
	int id;
	String dep;
	String address;
	int salary;
	
	public EmployeeConstruct(String a,int b,String c,String d,int e) 
	{
		name=a;
		id=b;
		dep=c;
		address=d;
		salary=e;
	}
	public static void main(String[] args) {
	
	EmployeeConstruct emp1=new EmployeeConstruct("1. Pranita", 101, "IT", "Pune", 5000);
	System.out.println(emp1.name+" "+emp1.id+" "+emp1.dep+" "+emp1.address+" "+emp1.salary);
	
	EmployeeConstruct emp2=new EmployeeConstruct("2. Pranali", 102, "HR", "Nashik", 8000);
	System.out.println(emp2.name+" "+emp2.id+" "+emp2.dep+" "+emp2.address+" "+emp2.salary);
	
	EmployeeConstruct emp3=new EmployeeConstruct("3. Sakshi", 103, "IT", "Baramati", 4000);
	System.out.println(emp3.name+" "+emp3.id+" "+emp3.dep+" "+emp3.address+" "+emp3.salary);
	
	EmployeeConstruct emp4=new EmployeeConstruct("4. Aarti", 104, "HR", "Pune", 6000);
	System.out.println(emp4.name+" "+emp4.id+" "+emp4.dep+" "+emp4.address+" "+emp4.salary);
	
	EmployeeConstruct emp5=new EmployeeConstruct("5. Vidhi", 105, "IT", "Baramati", 9000);
	System.out.println(emp5.name+" "+emp5.id+" "+emp5.dep+" "+emp5.address+" "+emp5.salary);

	}

}
