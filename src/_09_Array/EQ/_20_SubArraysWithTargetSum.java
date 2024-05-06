//66- Print the count of subarrays whose sum is equal to the target.
//Ex - {1,2,3,7,5}, T = 12  O/P - 2 - [ {2,3,7}, {7,5} ] - Both the subarrays has sum 12
package _09_Array.EQ;
public class _20_SubArraysWithTargetSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5} ;
        int target = 12 ;           //2,3,7  ;  7,5
        int count = 0;

        for(int i=0; i<arr.length ; i++){
            int sum=0;
            for(int j=i ; j< arr.length ; j++){
                sum = sum + arr[j];
                if(sum==target){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
