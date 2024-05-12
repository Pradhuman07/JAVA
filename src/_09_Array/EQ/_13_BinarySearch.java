package _09_Array.EQ;

import java.util.Arrays;

public class _13_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Arrays.sort(arr);                   //Quick Sort
        //Requirement of Binary Search:- Data should be sorted

        int target = 6;
        int index = -1;

        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;
            }
            else if (arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        System.out.println(index == -1 ? "E not found" : "E Found at index " + index);
    }
}
