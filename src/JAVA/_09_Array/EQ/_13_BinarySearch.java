package JAVA._09_Array.EQ;
import java.util.Arrays;
public class _13_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 6;

        Arrays.sort(arr);                   //Quick Sort...Requirement of Binary Search:- Data should be sorted

        int index = -1;

        int i=0 , j=arr.length-1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (arr[mid] == target) {
                index = mid;
                break;
            }

            else if (arr[mid] > target) j = mid - 1;
            else i = mid + 1;
        }
        System.out.println(index == -1 ? "not found" : "Found at index " + index);
    }
}
