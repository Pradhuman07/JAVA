package _16_Hashing;
import java.util.HashMap;
public class EQ_84_Frequency_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,5,5,6,7,8,8};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a : arr)
            map.put(a , (map.getOrDefault(a,0)+1) );     //agr a mile to uski value +1 ..nhi to 0 +1

        System.out.println(map);

    }
}

//        for(int a : arr){
//            if(!map.containsKey(a))
//                map.put(a , 1);
//            else
//                map.put(a , map.get(a)+1);       //a key ki value(freq) nikalo aur use +1 krdo
//        }
