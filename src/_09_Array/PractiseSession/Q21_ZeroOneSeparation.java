package _09_Array.PractiseSession;
import java.util.Arrays;
public class Q21_ZeroOneSeparation {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,0,1,1,0,1,0,0};

        int i=0,j=arr.length-1;

        while(i<j){
            while(i<arr.length && arr[i]==0) i++;
            while(j>=0 && arr[j]==1) j--;

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}