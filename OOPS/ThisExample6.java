package OOPS;
class Student
{
	String name;
	int rollno;
	
	Student()
	{
		name="Akash";
		rollno=101;
	}
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	void display()
	{
		System.out.print("Name : "+ name +" Roll No : "+rollno+" Marks : ");
	}
	int calculateMarks(int s1,int s2,int s3,int s4)
	{
		 this.display();
		return s1+s2+s3+s4;
	}
	
}
public class ThisExample6 {

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.calculateMarks(20, 30, 40, 10));
		
		Student s1=new Student("Priya",102);
		System.out.println(s1.calculateMarks(20, 10, 10, 20));
		

	}

}
