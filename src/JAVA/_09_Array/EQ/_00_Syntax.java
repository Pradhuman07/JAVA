package JAVA._09_Array.EQ;
import java.util.Arrays;
import java.util.Scanner;
public class _00_Syntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n ; i++){
            System.out.println("Enter the Element at index" + i);
            arr[i] = sc.nextInt();
        }

        for(int i=0 ; i<n ; i++){
            System.out.println(arr[i]);
        }

        for(int a:arr){
            System.out.println(a);
        }

        System.out.println(Arrays.toString(arr));
    }
}
