package _09_Array.PractiseSession;

public class Q13_MaximumELementUsingMathFunction {
    public static void main(String[] args) {
        int[] arr = {1,2,6,4,5};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max,arr[i]);
        }
        System.out.println(max);
    }
}