package JAVA._16_Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class _01_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(8);
        set.add(5);
        set.add(60);
        set.add(4);
        set.add(60);
        set.add(60);
        set.add(null);
        set.add(null);

        System.out.println(set);

        System.out.println(set.size());    //6

        set.remove(8);
        System.out.println(set.size());    //5
        System.out.println(set);

        System.out.println(set.contains(3));    //false

        Iterator it = set.iterator();              //Iterator = class ..set.iterator() is a method

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

// Set<Integer> set = new HashSet<>(); //bhi likh skte th

// Operations on HashMap:-

//     ● Adding an element:                     add(data)
//     ● Remove:                                remove(value)
//     ● DeleteAll:                             clear()
//     ● Check if set contain particular key:   contains(value)
//     ● iterator over all the values:          iterator()
//     ● Size:                                  size()



