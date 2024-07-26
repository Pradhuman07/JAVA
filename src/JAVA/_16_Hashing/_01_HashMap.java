package JAVA._16_Hashing;
import java.util.HashMap;
import java.util.Map;

public class _01_HashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();

        map.put(1,"Ram");
        map.put(4,"Shyam");
        map.put(3,"Krishna");
        map.put(2,"Radha");

        map.put(10,"Shiv");

        System.out.println(map);

        System.out.println(map.size());             //5
        System.out.println(map.get(2));             //Radha
        System.out.println(map.containsKey(3));            //true
        System.out.println(map.containsValue("Shiv"));     //true

        map.remove(4);
        System.out.println(map);
        System.out.println(map.size());     //4

        map.replace(2,"Parvati");    //map.put bhi kr skte th dubara like line 30
        System.out.println(map);

        map.put(10,"Ganesh");      //key 10 ki value replaced
        System.out.println(map);

        System.out.println(map.size());    //4

        map.put(null , null);
        System.out.println(map);

        System.out.println(map.size());   //null bhi size leta h   //5

        map.put(null , "Updated value");
        System.out.println(map);


        for(Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e.getKey() + "->" + e.getValue());
        }

        for(var e : map.entrySet()){
            System.out.println(e.getKey() + "->" + e.getValue());
        }

        for(var e : map.entrySet()){
            System.out.println(e);
        }

        for(int e : map.keySet()){
            System.out.println(e);
        }

        for(String e : map.values()){
            System.out.println(e);
        }

    }
}

//Map<Integer,String> map = new HashMap<>(); //bhi likh skte h Map is a Parent of Hashmap..inheritence
//Map does not follow insertion order ...any order


//    Operations on HashMap:-

//        -Adding an element:                         put(key,value)
//        -Replace or Update:                         replace(key,newValue)
//        -Retrieve an element:                       get(key)
//        -Remove:                                    remove(key)
//        -DeleteAll:                                 clear()
//        -Check if map contain particular key:       containsKey(key)
//        -Check if map contain particular value:     containsValue(key)
//        -Check if map is empty:                     isEmpty()
//        -Size:                                      size()

//null bhi size leta h
//key repeat kroge to new value set hojyegi old replaced