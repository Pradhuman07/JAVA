package _16_Hashing;
import java.util.HashMap;
public class EQ_85_PrintOnlyUnique {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6,6,7,8,8,9};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a : arr)
            map.put(a , map.getOrDefault(a,0)+1);

        for(int a : map.keySet())
            if(map.get(a)==1) System.out.println(a);

        for(var a : map.entrySet())
            if(a.getValue()==1) System.out.println(a.getKey());


        //ooper hr element ko bss ek bar touch kia jayega na ki utni bar jitni bar wo array mein aaya h
        //jbki neeche hr element ko bar bar touch kr rhe jitni bar wo array me aaya

//        for(int a : arr)                  //idr poore loop pe traverse hoga mtlb no.Of.Traversal = arr.length
//            if(map.get(a)==1) System.out.println(a);

    }
}
