package _09_Array.EQ;

import java.util.Arrays;

public class _05_2ndSmallest {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 1, 4, 5, 2, 2};

//        int smallest = Math.min(arr[0], arr[1]);
//        int secondSmallest = Math.max(arr[0], arr[1]);

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println(secondSmallest);
    }
}
