package _09_Array.Main;

import java.util.Arrays;

public class EffQ2ndlast {
    public static void main(String[] args) {
        int[] arr = {8,-4,-9,2,1,44,-96,-14,58};
//        Arrays.sort(arr);    //Quick Sort behind the scene
//        System.out.println(Arrays.toString(arr));
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for(int j=0,k= arr.length-1; j< arr.length && k>0 ; i++,j--){
                if(arr[i]<0) temp[j] = arr[i];
                else temp[k] = arr[i];
            }
        }
    }
}
//1st method sorting
//2nd method space wala red ball black ball