
package Collection;

import java.util.HashMap;
import java.util.TreeMap;

public class hashMap {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(1, 12);
		map.put(22, "Pranita");
		map.put(null, 121);
		map.put(11, 90.98);
		map.put(2, 567);
		
		System.out.println(map);
		
		HashMap map1=new HashMap();
		map1.putAll(map);
		System.out.println(map1);
		
		//to search a key in a map
		System.out.println(map.containsKey(1));
		
		//to get the view of keys contain in a map
		System.out.println(map.keySet());
		
		//to get a collection view of values
		System.out.println(map.values());
		
		//map contains key value pair or not
		System.out.println(map.isEmpty());
		
		//to copy a treemap content to another treemap
	       HashMap t=(HashMap) map.clone();
	        System.out.println(t);
		
		//to get all the keys from the given treemap
		System.out.println(map.keySet());
		
		//to check if a map contains a specific value
		System.out.println(map.containsValue(null));
		
		//to check if a map contains a specific key
		System.out.println(map.containsKey(11));
	    
		//to get the value of a specific key
		System.out.println(map.get(22));
		
		//get the number of elements
		System.out.println(map.size());
		
		//delete all
		map.clear();
		System.out.println(map);

	}

}
