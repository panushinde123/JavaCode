package String;
import java.util.*;

public class PairWithDifference {
    public static int countPairsWithDifference(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        
        for (int num : arr) {
            if (set.contains(num - k)) {
                count++;
            }
            if (set.contains(num + k)) {
                count++;
            }
            set.add(num);
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};
        int k = 3;
        int result = countPairsWithDifference(arr, k);
        System.out.println("Output: " + result); // Output: 2
    }
}
