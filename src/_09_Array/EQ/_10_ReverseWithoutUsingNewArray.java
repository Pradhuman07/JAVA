package _09_Array.EQ;
import java.util.Arrays;
public class _10_ReverseWithoutUsingNewArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        for(int i=0,j=arr.length-1; i<j ; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];       //bijli
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}