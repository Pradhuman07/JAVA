package JAVA._09_Array._2D_Array;
import java.util.Scanner;
public class syntax {
    public static void main(String[] args) {
//      int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] arr = new int[3][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter element at positon " + i + j);
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//        for (int i = 0; i < arr.length; i++) {
//        for (int j = 0; j < arr[i].length; j++) {
////                if (i == j || i + j == arr.length - 1) {
//        System.out.print(arr[i][j] + " ");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//                    System.out.println();
//        }
