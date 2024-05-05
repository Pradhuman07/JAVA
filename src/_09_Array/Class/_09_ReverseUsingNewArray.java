package _09_Array.Class;
import java.util.Arrays;
public class _09_ReverseUsingNewArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] rev = new int[arr.length];

        for (int i=0,j=arr.length-1; i<arr.length; i++,j--) {    //j=arr.length-1 not arr.length
            rev[i] = arr[j];       //rev[0]=arr[4];
        }
        System.out.println(Arrays.toString(rev));
    }
}