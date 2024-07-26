//17 . Given an array of integers, update every element with the multiplication of previous and next elements with the following exceptions.
//
//        a) The First element is replaced by the multiplication of the first and second.
//        b) The last element is replaced by multiplication of the last and second last.
//
// Example:
//        Input  : arr[] = {2, 3, 4, 5, 6}
//        Output : arr[] = {6, 8, 15, 24, 30}
package JAVA._09_Array.PractiseSession;
import java.util.Arrays;
public class Q17_UpdatePrevNext {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = new int[arr.length];

        ans[0]=arr[0]*arr[1];
        ans[arr.length-1]=arr[arr.length-1]*arr[arr.length-2];

        for(int i=1; i< arr.length-1 ; i++)
            ans[i] = arr[i-1]*arr[i+1];

        System.out.println(Arrays.toString(ans));
    }
}
