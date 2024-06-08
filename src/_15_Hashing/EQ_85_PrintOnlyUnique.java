package _15_Hashing;
import java.util.HashMap;
public class EQ_85_PrintOnlyUnique {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6,6,7,8,8,9};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a : arr)
            map.put(a , map.getOrDefault(a,0)+1);

        for(var a : map.entrySet())
            if(a.getValue()==1) System.out.println(a.getKey());      //idr sirf elements with value==1 pr hi traverse hoga mtlb no.of.Traversal=no.of.Unique Elements

//        for(int a : arr)                  //idr poore loop pe traverse hoga mtlb no.Of.Traversal = arr.length
//            if(map.get(a)==1) System.out.println(a);
    }
}
