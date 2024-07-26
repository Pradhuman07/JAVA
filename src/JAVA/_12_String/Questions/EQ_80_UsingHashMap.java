package JAVA._12_String.Questions;
import java.util.HashMap;
public class EQ_80_UsingHashMap {
    public static void main(String[] args) {
        String s = "loveleetcode";
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray())
            map.put(ch , map.getOrDefault(ch,0)+1);

        System.out.println(map);
    }
}
