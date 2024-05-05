//Sum of abs diff of all the pairs of array
package _09_Array.PractiseSession;
public class Q1_AbsDiffSumAllPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int sum = 0;

        for(int i=0 ; i< arr.length ; i++){
            for(int j=i+1 ; j< arr.length ; j++){
                sum = sum + Math.abs(arr[i]-arr[j]);
            }
        }
        System.out.println(sum);
    }
}
