package Collection;

import java.util.*;

public class comparableMyClass {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		
		Student s1=new Student(89,76,91,54);
		list.add(s1);
		Student s2=new Student(78,86,71,72);
		list.add(s2);
		Student s3=new Student(81,87,56,84);
		list.add(s3);
		Student s4=new Student(80,76,61,68);
		list.add(s4);
		Student s5=new Student(66,86,77,82);
		list.add(s5);

		Collections.sort(list,new comparatorMethod()); // for comparator
		//Collections.sort(list);    for comparable
		
		for(Student s:list)
		{
			System.out.println(s);
		}
	}

}
