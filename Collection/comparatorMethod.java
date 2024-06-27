package Collection;

import java.util.Comparator;

public class comparatorMethod implements Comparator<Student>	{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.ug>o2.ug)
			return 1;
		else if(o1.ug<o2.ug)
			return -1;
		else
		return 0;
	}
}