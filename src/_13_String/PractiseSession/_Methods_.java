package _13_String.PractiseSession;
import java.util.Arrays;
public class _Methods_ {
    public static void main(String[] args) {

        System.out.println("Hello".substring(2));
        System.out.println("Hello".substring(2,4));  //2 se shuru hoga but 4 se pehle tk not 4

        String s = "Hello Bhai Kya haal";
        //String n = s.split("  ");   //Error---array me convert krdega each words ko
        String[] n = s.split(" ");
        System.out.println(Arrays.toString(n));

        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());

        System.out.println("Hello".startsWith("H"));
        System.out.println("Hello".endsWith("llo"));

        System.out.println("hello".equals("Hello"));
        System.out.println("hello".equalsIgnoreCase("Hello"));
        System.out.println("hello".compareTo("Hello"));


    }
}