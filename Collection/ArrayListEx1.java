package Collection;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
	    list.add(10);
	    list.add(20);
	    list.add(null);
	    list.add(20);
	    
	    list.toArray();
	    System.out.println(list);
	  

	}

}
