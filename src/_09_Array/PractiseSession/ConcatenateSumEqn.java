package _09_Array.PractiseSession;

import java.util.Scanner;

public class ConcatenateSumEqn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element at " + i);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(i!= arr.length-1) System.out.print(arr[i] + "+");
            else System.out.print(arr[i]);
            sum += arr[i];
        }
        System.out.print("=" + sum);
    }
}
