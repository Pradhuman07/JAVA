package _09_Array.EQ;

import java.util.Arrays;

public class _05_2ndSmallest {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 2};

        int smallest = Math.min(arr[0],arr[1]);
        int secondSmallest = Math.max(arr[0],arr[1]);

        for (int i = 2; i < arr.length; i++) {   //NOTE:- Agr initialize int i=0; se krrhe ho to you are glt
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i]<secondSmallest && arr[i]!=smallest) {
                secondSmallest = arr[i];
            }
        }

        System.out.println("Second Smallest Element in the Array " + Arrays.toString(arr) + " is: " + secondSmallest);
    }
}
