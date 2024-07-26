package JAVA._09_Array.PractiseSession;
import java.util.Arrays;
public class Q22_NegPosSeparation {
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
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }
}