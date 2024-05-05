package _09_Array.PractiseSession;
public class Q6_BalanceArray {
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
