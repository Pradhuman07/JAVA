package _09_Array.Main;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int n= arr.length-1;     //since for n elements , no. of passes are n-1

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n-i ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}