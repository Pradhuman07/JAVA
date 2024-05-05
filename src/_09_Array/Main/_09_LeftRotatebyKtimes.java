package _09_Array.Main;

import java.util.Arrays;

public class _09_LeftRotatebyKtimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 43;

        k=k%n;

        while (k-- > 0){                    //k times...like patterns
            int temp = arr[0];           //1 time
            for(int i=0; i<n-1 ; i++){
                arr[i] = arr[i+1];
            }
            arr[n-1] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
