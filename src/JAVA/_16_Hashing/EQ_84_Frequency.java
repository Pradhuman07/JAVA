package JAVA._16_Hashing;
import java.util.Arrays;
import java.util.HashMap;
public class EQ_84_Frequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,5,5,6,7,8,8};

        HashMap<Integer,Integer> map = new HashMap<>();   //key = a , value = frequency

        for(int a : arr){
            if(!map.containsKey(a))
                map.put(a , 1);
            else
                map.put(a , map.get(a)+1);       //a key ki value(freq) nikalo aur use +1 krdo
        }

        System.out.println(map);
        System.out.println(Arrays.toString(map.entrySet().toArray()));
    }
}
