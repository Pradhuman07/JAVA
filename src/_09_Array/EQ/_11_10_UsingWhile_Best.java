package _09_Array.EQ;
import java.util.Arrays;
public class _11_10_UsingWhile_Best {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4 , 5};

        int i=0 , j= arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}