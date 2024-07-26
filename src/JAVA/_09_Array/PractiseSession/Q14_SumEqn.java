package JAVA._09_Array.PractiseSession;
public class Q14_SumEqn {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if(i!= arr.length-1) System.out.print(arr[i] + "+");
            else System.out.print(arr[i]);
            sum += arr[i];
        }

        System.out.print("=" + sum);
    }
}
