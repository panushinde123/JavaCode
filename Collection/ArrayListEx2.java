package Collection;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Red");
		list.add("Blue");
		list.add("Purple");
		list.add("Green");
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		System.out.println("Collection of Colors: "+list);
		
		for(String ele:list)                    //for each loop
		{
			System.out.print(ele+" ");
		}
		
		list.add(0, "Orange");
		System.out.println("Add color at first: "+list);
		
		list.remove(3);
		System.out.println("Removing element of third position: "+list);
		
		
		ArrayList list2=new ArrayList();
		list2=list;               //copy list into list2
		System.out.println(list2);
         list.set(0, "hi");
         System.out.println(list);
	}
	

}
