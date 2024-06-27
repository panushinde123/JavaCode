package Collection;

import java.util.ArrayList;
import java.util.Vector;

public class methods {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
	    list.add(10);
	    list.add(20);
	    list.add(null);
	    list.add("Pranita");
	    list.add('a');
	    list.add(20);
	    System.out.println(list);
	    list.add(1, "Pranali");
	    System.out.println(list);
	    System.out.println("Index of element:"+list.indexOf("Pranita"));
	   System.out.println("Size: "+list.size());
	   list.remove(5);
	   System.out.println(list);
	   
	   System.out.println();
	   
	  Vector v=new Vector();
	    v.add(100);
	    v.add(200);
	    v.add(null);
	    v.add("Omkar");
	    v.add('v');
	    v.add(200);
	    v.add("aarya");
	    System.out.println(v);
	    v.add(1, "Reyansh");
	    System.out.println(v);
	    System.out.println("Index of element:"+v.indexOf("Reyansh"));
	   System.out.println("Size: "+v.size());
	  v.remove(5);
	   
	   System.out.println(v);

	}

}
