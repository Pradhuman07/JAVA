//Q20.Given an array of even size, task is to find minimum value that can be added to an element so that array become balanced.
//An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.
//Suppose, we have an array 1 3 1 2 4 3.
//The Sum of first three elements is 1 + 3 + 1 = 5 and sum of last three elements is 2 + 4 + 3 = 9
//So this is unbalanced, to make it balanced the minimum number we can add is 4 to any element in first half.

//Examples :
//Input : 1 2 1 2 1 3
//Output : 2

//Sum of first 3 elements is 1 + 2 + 1 = 4,
//sum of last three elements is 2 + 1 + 3 = 6
//To make the array balanced you can add 2.

//Input : 20 10
//Output : 10

package JAVA._09_Array.PractiseSession;
public class Q20_BalanceArray {
    public static void main(String[] args) {
        int[] arr= {4,1,5,3};

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(i< arr.length/2) sumLeft+=arr[i];
            else sumRight+=arr[i];
        }

        System.out.println(Math.abs(sumLeft-sumRight));
    }
}
