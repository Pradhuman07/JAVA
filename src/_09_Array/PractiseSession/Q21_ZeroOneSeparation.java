package _09_Array.PractiseSession;

import java.util.Arrays;

public class Q21_ZeroOneSeparation {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,0,1,1,0,1,0};

        int i=0,j=0;
        while(i< arr.length){
            if(arr[i]!=1){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
