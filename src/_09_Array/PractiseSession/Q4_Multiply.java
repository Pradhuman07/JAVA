package _09_Array.PractiseSession;

import java.util.Arrays;

public class Q4_Multiply {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = new int[arr.length];

        ans[0]=arr[0]*arr[1];
        ans[arr.length-1]=arr[arr.length-1]*arr[arr.length-2];

        for(int i=1; i< arr.length-1 ; i++){
            ans[i] = arr[i-1]*arr[i+1];
        }

        System.out.println(Arrays.toString(ans));
    }
}
