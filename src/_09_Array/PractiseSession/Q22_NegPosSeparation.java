package _09_Array.PractiseSession;

import java.util.Arrays;

public class Q22_NegPosSeparation {
    public static void main(String[] args) {
        int[] arr = {10, -2, 6, -3, -8, 4, 5, -7};

        int i = 0, j = 0;
        while (i < arr.length) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}