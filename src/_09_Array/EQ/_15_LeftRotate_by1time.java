package _09_Array.EQ;
import java.util.Arrays;
public class _15_LeftRotate_by1time {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};  //2,3,4,5,1
        int n = arr.length;

        int temp = arr[0];

        for(int i=0; i<(n-1) ; i++)
            arr[i] = arr[i+1];

        arr[n-1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
