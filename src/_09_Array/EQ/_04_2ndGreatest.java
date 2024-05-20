package _09_Array.EQ;
public class _04_2ndGreatest {
    public static void main(String[] args) {
        int[] arr = {9,9,6,5,4,9,3,3,1,2};

//        int greatest = Math.max(arr[0], arr[1]);         //What if both arr[0] and arr[1] are equal? therefore take
//        int secondGreatest = Math.min(arr[0], arr[1]);

        int greatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > greatest) {
                secondGreatest = greatest;
                greatest = arr[i];
            }
            else if (arr[i] > secondGreatest && arr[i]!=greatest) {
                secondGreatest = arr[i];
            }
        }
        System.out.println("The Second Greatest Element is: " + secondGreatest);
    }
}
