package _15_Hashing;

import java.util.HashMap;

public class EQ_83_Frequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,5,5,6,7,8,8};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a : arr){
            if(map.containsKey(a)){
                int oldFreq = map.get(a);
                int newFreq = oldFreq+1;
                map.put(a , newFreq);
            }
            else{
                map.put(a , 1);
            }
        }

        System.out.println(map);
    }
}
