package _12_String.Questions;
import java.util.Arrays;
public class EQ_81_Anagram {
    public static void main(String[] args) {
        String s1 = "state";
        String s2 = "taste";

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2));

        s1 = new String(ch1);
        s2 = new String(ch2);

        System.out.println(s1.equals(s2));
    }
}