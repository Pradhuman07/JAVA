package _16_Hashing;
import java.util.HashMap;
public class EQ_84_Frequency_ch {
    public static void main(String[] args) {
        String s = "loveleetcode";
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray())
            map.put(ch , map.getOrDefault(ch,0)+1);

        System.out.println(map);
    }
}
