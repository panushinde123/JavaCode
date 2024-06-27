package Basic;

import AccessSpecfier.Employee1;

public class Myclass {

	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		e1.setName("Akash");
		e1.setSalary(78000);
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
	}

}
