package VariationCode;

public class RotationCount {

    public static int findRotationCount(int[] arr) {
        int N = arr.length;
        int minElement = arr[0];
        int minIndex = 0;

        for (int i = 1; i < N; i++) {
            if (arr[i] < minElement) {
                minElement = arr[i];
                minIndex = i;
            }
        }
        
        return minIndex;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 1, 2, 3, 4};
        System.out.println(findRotationCount(arr1)); // Output: 1

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(findRotationCount(arr2)); // Output: 0
    }
}

