package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class frequencyofobjects {

	public static void main(String[] args) {
		int[] a= {1,1,1,1,1,1,2,2,2,2,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4};
		Map<Integer, Integer> map=new LinkedHashMap<>();
		for(int num:a)
		{
			int val=map.getOrDefault(num, 0);
			val++;
			map.put(num, val);
		}
		System.out.println(map);

	}

}
