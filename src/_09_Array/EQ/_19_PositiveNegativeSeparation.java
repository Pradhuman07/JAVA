//65- Move all the negative elements on left side and positive elements on right side O(n).
package _09_Array.EQ;
import java.util.Arrays;
public class _19_PositiveNegativeSeparation {
    public static void main(String[] args) {
        int[] arr = {10, -2, 6, -3, -8, 4, 5, -7};

        int i=0,j=arr.length-1;

        while(i<j){
            while(i<arr.length && arr[i]<0) i++;
            while(j>=0 && arr[j]>0) j--;

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}