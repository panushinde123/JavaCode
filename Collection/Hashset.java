package Collection;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
	HashSet h=new HashSet();
	
	h.add(67);
	h.add("Priyansh");
	h.add(17.07);
	h.add(1000);
	h.add("Aarya");
	h.add('V');
	h.add(null);
	System.out.println(h);
	
	//check hashset is empty or not
	System.out.println(h.isEmpty());
	
	//clone a hashset
	HashSet hs=(HashSet) h.clone();
     System.out.println(hs);
     
     //append the specified element to the end of the hashset
       h.add(88);
       System.out.println(h);
     
     //to compare two hashset
     System.out.println(h.equals(hs));
     
     //to get the number of elements in a hashset.
     System.out.println(h.size());
     
     //remove all of the elements
//     h.clear();
//     System.out.println(h);
     
     

	
	}

}
