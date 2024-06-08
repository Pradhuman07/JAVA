package _15_Hashing;
import java.util.Arrays;
import java.util.HashSet;
public class EQ_83_PrintOnlyOnce {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,4,5,6,7,7,8,1,9,10};

        HashSet<Integer> set = new HashSet<>();

        for(int a : arr){
            set.add(a);
        }

        System.out.println(set);

        System.out.println(Arrays.toString(set.toArray()));
    }
}
//Q.Print all the elements of array but Only one time