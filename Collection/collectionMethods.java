package Collection;
import java.util.*;
public class collectionMethods {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(90);
		list.add(50);
		list.add(20);
		list.add(30);
		List<Integer> list1=new ArrayList<>();
		Collections.sort(list);
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println(Collections.max(list));
		
		System.out.println(Collections.min(list));
		
		
		
			
	}

}
