package _09_Array.Class;
import java.util.Arrays;
import java.util.Scanner;
public class _01_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of an Array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.println("Enter the Element at " + i);
            arr[i] = sc.nextInt();
        }

        int sum=0;
        for(int a:arr){
            sum+=a;
        }

        System.out.println("Array:- " + Arrays.toString(arr));
        System.out.println("Sum of Elements is: "+sum);
    }
}