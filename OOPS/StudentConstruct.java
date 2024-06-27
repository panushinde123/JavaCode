package OOPS;

public class StudentConstruct {
	
	String name;
	int id;
	String email;
	
	StudentConstruct(String i,int j,String k)
	{
		name=i;
		id=j;
		email=k;
	}

	public static void main(String[] args) {
		StudentConstruct s1=new StudentConstruct("Pankaj",55,"abc");
		System.out.println(s1.name+" "+s1.id+" "+s1.email);
		StudentConstruct s2=new StudentConstruct("Akash",75,"xyz");
		System.out.println(s2.name+" "+s2.id+" "+s2.email);
		
	}

}
