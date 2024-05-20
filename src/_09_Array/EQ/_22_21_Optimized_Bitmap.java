package _09_Array.EQ;

import java.util.Arrays;

public class _22_21_Optimized_Bitmap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 5, 2, 2, 6};

        int max = -1;
        for(int a:arr){
            max = Math.max(a,max);
        }
        System.out.println(max);

        int[] freq = new int[max+1];   //+1 in order to store max at arr[max] and not arr[max-1]

        for(int a : arr){
            freq[a]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>0) System.out.println(i + "->" + freq[i]);
        }
    }
}
