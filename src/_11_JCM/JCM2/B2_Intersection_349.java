package _11_JCM.JCM2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class B2_Intersection_349 {

    public static ArrayList Intersection(int[] nums1 , int[] nums2){

        ArrayList<Integer> list = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();

        for(int a : nums1)
            set.add(a);

        for(int a : nums2)
            if (set.contains(a) && !(list.contains(a)))
                list.add(a);

        return list;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of nums 1");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        for(int i=0 ; i<n1 ; i++){
            System.out.println("Enter the element at index :- " + i);
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of nums 2");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for(int i=0 ; i<n2 ; i++){
            System.out.println("Enter the element at index :- " + i);
            nums2[i] = sc.nextInt();
        }

        System.out.println("Answer:- " + Intersection(nums1,nums2));
    }
}
