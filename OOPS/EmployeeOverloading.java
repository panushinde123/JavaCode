package OOPS;

public class EmployeeOverloading {
	String name;
	String contactNo;
	String designation;
  
  EmployeeOverloading()
  {
	 name="Pranita";
	 contactNo="7066973647";
	 designation="HR";
   }
  
  EmployeeOverloading(String name)
  {
	  this.name=name;
  }
  EmployeeOverloading(String name,String contactNo)
  {
	  this.name=name;
	  this.contactNo=contactNo;
  }
  EmployeeOverloading(String name,String contactNo,String designation)
  {
	  this.name=name;
	  this.contactNo=contactNo;
	  this.designation=designation;
  }
  void display()
  {
	  System.out.println(name+" "+contactNo+" "+designation);
  }
 
	public static void main(String[] args) {
		EmployeeOverloading e1=new EmployeeOverloading();
		e1.display();
		EmployeeOverloading e2=new EmployeeOverloading("Sadhana");
		e2.display();
		EmployeeOverloading e3=new EmployeeOverloading("Sakshi", "8976897876");
		e3.display();
		EmployeeOverloading e4=new EmployeeOverloading("Vaishali", "9898989898", "Developer");
		e4.display();

	}

}
