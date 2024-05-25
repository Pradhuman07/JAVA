package _09_Array.EQ;

public class WrongFrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,5,5};

        int count=1;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]) count++;
            else {
                System.out.println(arr[i] + "=" + count);
                count=1;
            }
        }
    }
}
