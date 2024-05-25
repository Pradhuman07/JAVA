package _01_Basics;

import java.util.Arrays;

public class NumberIntoArray {
    public static void main(String[] args) {
        int num = 4532;

        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = num%10;
            num/=10;
        }

        System.out.println(Arrays.toString(arr));   //2,3,5,4
    }
}
