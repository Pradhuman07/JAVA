package JAVA._11_JCM.JCM2;
import java.util.HashMap;
import java.util.Scanner;

public class B1_MajorElement_169 {

    public static int majorElement(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a : arr)
            map.put(a, map.getOrDefault(a,0)+1);

        for(int k : map.keySet())
            if(map.get(k)>(n/2)) return k;

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            System.out.println("Enter element at index:- " + i);
            arr[i] = sc.nextInt();
        }

        System.out.println("Answer:- " + majorElement(arr));
    }
}
