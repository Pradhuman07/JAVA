package _17_setques;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class _03_UsingHashSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,6,6,7,7,9};

        Set<Integer> uniq = new HashSet<>();
        for(int e : arr)
            uniq.add(e);
        System.out.println(uniq);   //set print ho rha..can never be returned

        int[] ans = new int[uniq.size()];
        int i = 0;
        for(int e : uniq)
            ans[i++] = e;
        System.out.println(Arrays.toString(ans));
    }
}

//TC = O(n)
//list me O(n) thi ya shyd jyada