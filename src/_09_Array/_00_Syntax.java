package _09_Array;
import java.util.Scanner;
public class _00_Syntax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i< arr.length ; i++){
            System.out.println("Enter the element at index " + i);
            arr[i] = sc.nextInt();
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        System.out.println("Your Array is:-");

        for(int a:arr){                 //arr ke elements a mein daal diye..But phle a ko declare kia
            System.out.print(a + ",");
        }

        //Advanced for loop or for each loop ..yha indexing ki dikkt nhi
    }
}
