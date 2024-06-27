package Collection;
import java.util.*;

public class compareTwoLinkedlist {
    public static void main(String[] args) {
        LinkedList<String> c1 = new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        LinkedList<String> c2 = new LinkedList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Orange");

        List<String> result = myCode(c1, c2);
        System.out.println(result);
    }

    public static List<String> myCode(LinkedList<String> c1, LinkedList<String> c2) {
        List<String> result = new ArrayList<>();
        for (String item : c1) {
            if (c2.contains(item)) {
                result.add("Yes");
            } else {
                result.add("No");
            }
        }
        return result;
    }
}
