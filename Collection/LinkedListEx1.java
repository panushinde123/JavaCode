package Collection;

import java.util.LinkedList;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(10);
		list.add('v');
		list.add("abc");
		list.add(20);
		list.add(null);
		
		System.out.println(list);
		list.addFirst("PQR");
		list.addLast(100);

		System.out.println(list);
		System.out.println("index of 20:"+list.indexOf(20));
		System.out.println("first element:"+list.getFirst());
		System.out.println("size:"+list.size());
		System.out.println("list contains abc: "+list.contains("abc"));
		//list.clear();
		System.out.println(list);
		
		LinkedList list1=new LinkedList();
		list1.add(10);
		list1.add('v');
		list1.add("abc");
		list1.add(20);
		
		
		System.out.println(list.containsAll(list1));
	}

}
