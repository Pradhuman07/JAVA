package _09_Array.EQ;
import java.util.Arrays;
public class _17_RightRotate_by1time_ulta_loop_must {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};    //5,1,2,3,4

        int n = arr.length;

        int temp = arr[n-1];

        for(int i=n-1 ; i>0 ; i--)    //ulta loop hi lgega
            arr[i] = arr[i-1];

        arr[0] = temp;

        System.out.println(Arrays.toString(arr));

    }
}
